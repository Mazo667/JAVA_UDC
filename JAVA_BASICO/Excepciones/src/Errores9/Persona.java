package Errores9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Persona {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Persona getPersona(String nombre) throws NombreErroneoException{
		File file = new File ("nombres.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;
		boolean encontrado = false;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while ((linea = br.readLine()) != null) {
				if (linea.equalsIgnoreCase(nombre)) {
					encontrado = true;
				}
			}
			if (encontrado == true) {
				throw new NombreErroneoException("El nombre ingresado esta en la lista de nombres NO permitidos.");
				
			} else {
				if(nombre.length() > 3) {
					Persona persona = new Persona();
					persona.setNombre(nombre);
					return persona;
				}
				throw new NombreErroneoException("EL nombre es muy corto, tiene que se mayor de 3 caracteres");
			}
		} catch (IOException ex) {
			throw new NombreErroneoException("No se pudo leer el archivo de nombres.");
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException ex) {
					
				}
			}
		}
	}

}
