package Properties;

import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	//Leemos la propiedades desde un InputStream
	private static Properties _getProperties(InputStream is) throws Exception {
		Properties prop = new Properties();
		prop.load(is);
		return prop;
	}
	
	public static Properties getproperties(String filename) {
		//Obtendremos el FileInputStream y leemos la props
		try(FileInputStream fis = new FileInputStream(filename)){
			return _getProperties(fis);
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
		public static Properties getProperties(Class<?> clazz) {
		//obtendremos el nombre del archivo
		String fname = clazz.getName().replace('.','/');
		fname += ".properties";
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		
		try(InputStream is = loader.getResourceAsStream(fname)){
			return _getProperties(is);
		}catch(Exception e) {
			e.printStackTrace();
		throw new RuntimeException(e);
		}
	}
}

