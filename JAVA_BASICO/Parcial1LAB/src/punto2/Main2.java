package punto2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main2 {

	public static void main(String[] args) throws IOException {
		String nombreArchivo = "/home/maximiliano/Descargas/archivo_numeros.txt"; 

        int suma = 0;

        try (FileInputStream fis = new FileInputStream(nombreArchivo);
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("ISO-8859-1"));
             BufferedReader br = new BufferedReader(isr)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea);
                    suma += numero;
                } catch (NumberFormatException ignored) {
                    
                }
            }

            System.out.println("La suma de los números enteros es: " + suma);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}