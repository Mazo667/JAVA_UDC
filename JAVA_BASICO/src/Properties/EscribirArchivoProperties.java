package Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class EscribirArchivoProperties {
	public static void main(String[] args) throws IOException {
		//Declaramos una instancia de Properties
		Properties prop = new Properties();
		
		//Asignamos propiedades y valores
		prop.setProperty("nombre","Maximiliano");
		prop.setProperty("apellido", "Fava");
		prop.setProperty("FechaNacimiento", "19/8/1992");
		prop.setProperty("dni", "41324187");
		prop.setProperty("direccion", "Almafuerte 1878");
	try {
		//Archivo donde queremos grabar las propiedades
		String filename = "C:\\Users\\MAXIMILIANO\\git\\JAVA_BASICO\\JAVA_BASICO\\src\\Properties\\persona.properties";
		FileOutputStream fos = new FileOutputStream(filename);
		
		//Grabamos las propiedades
		prop.store(fos, "Esto es un comentario");
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
