package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class contarLineas {

	public static void main(String[] args) throws IOException {
		BufferedReader objetoLeido = null;
		int contador = 0;
		try {
			String linea;
			objetoLeido = new BufferedReader(new FileReader("/home/maximiliano/Escritorio/UDC/2do año/Laboratorio/miTexto.txt"));
			
			while ((linea = objetoLeido.readLine()) != null) {
				contador++;
			}
			
			System.out.println("El archivo tiene "+ contador + " lineas.");
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			objetoLeido.close();
		}
	}

}
