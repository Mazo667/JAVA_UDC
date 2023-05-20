package ejercicios;
import java.io.File;
import java.io.IOException;

public class CrearArchivosyCarpetas {

	public static void main(String[] args) {
        String[] nombresCarpetas = {"Carpeta1", "Carpeta2", "Carpeta3", "Carpeta4"};
        int cantidadArchivos = 10;
        String rutaBase = ("/home/maximiliano/Escritorio/UDC/2do año/Laboratorio/"); 
        for (String nombreCarpeta : nombresCarpetas) {
            String rutaCarpeta = rutaBase + nombreCarpeta;
            File carpeta = new File(rutaCarpeta);
            
            if (!carpeta.exists()) {
                carpeta.mkdir();
            }
            
            for (int i = 1; i <= cantidadArchivos; i++) {
                String nombreArchivo = "Archivo" + i + ".txt";
                String rutaArchivo = rutaCarpeta + "/" + nombreArchivo;
                File archivo = new File(rutaArchivo);
                
                try {
                    archivo.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}