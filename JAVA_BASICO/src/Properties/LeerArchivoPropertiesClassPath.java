package Properties;

import java.io.InputStream;
import java.util.Properties;
public class LeerArchivoPropertiesClassPath {

	public static void main(String[] args) {
		
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			
			//Preparamos para leer el archivo
			String filename = "persona.properties";
			InputStream is = loader.getResourceAsStream(filename);
			
			//Leemos las propeidades desde el archivo
			Properties prop = new Properties();
			prop.load(is);
			System.out.println(prop.getProperty("nombre"));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
