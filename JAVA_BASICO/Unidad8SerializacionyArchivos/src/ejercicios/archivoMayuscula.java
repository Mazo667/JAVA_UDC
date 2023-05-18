package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class archivoMayuscula {
	public static void main(String[] args) throws IOException {
		BufferedReader objetoLeido = null;
		BufferedWriter objetoEscritura = null;
		List <String> coleccion = new ArrayList();
		
		
		try {
			String linea;
			String archivoSalida = "/home/maximiliano/Escritorio/UDC/2do año/Laboratorio/mayus.txt";
			String archivoEntrada = "/home/maximiliano/Escritorio/UDC/2do año/Laboratorio/miTexto.txt";
			
			objetoLeido = new BufferedReader(new FileReader(archivoEntrada));
			objetoEscritura = new BufferedWriter(new FileWriter(archivoSalida,true));
			
			while ((linea = objetoLeido.readLine()) != null) {
					linea = linea.toUpperCase();
					coleccion.add(linea);
			}
			
			for (String coleccionLinea : coleccion) {
				objetoEscritura.write(coleccionLinea);
				objetoEscritura.newLine();
			}
			
			System.out.println(coleccion.size());
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			objetoLeido.close();
			objetoEscritura.close();
		}
	}

}

