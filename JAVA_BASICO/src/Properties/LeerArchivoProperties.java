package Properties;
import java.io.FileInputStream;
import java.util.Properties;

public class LeerArchivoProperties {

	public static void main(String[] args) {
		
		try {
			Properties prop = new Properties();
			
			//Archivo desde donde vamos a leer las propiedades
			String filename =  "C:\\Users\\MAXIMILIANO\\git\\JAVA_BASICO\\JAVA_BASICO\\src\\Properties\\persona.properties";
			FileInputStream fis = new FileInputStream(filename);
			prop.load(fis);
			
			System.out.println(prop.getProperty("nombre"));
			System.out.println(prop.getProperty("apellido"));
			System.out.println(prop.getProperty("direccion"));
			System.out.println(prop.getProperty("edad"));
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
