package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class coleccionCadenas {

	public static void main(String[] args) throws IOException {
		BufferedReader objetoLeido = null;
		List <String> coleccion = new ArrayList();
		
		try {
			String linea;
			objetoLeido = new BufferedReader(new FileReader("/home/maximiliano/Escritorio/UDC/2do año/Laboratorio/miTexto.txt"));
			
			while ((linea = objetoLeido.readLine()) != null) {
				coleccion.add(linea);
			}
			for (String colecciones : coleccion) {
				System.out.println(colecciones);
			}
			

		} catch(IOException e){
			e.printStackTrace();
		} finally {
			objetoLeido.close();
		}
	}


}
