package BaseDeDatosJDBC.DAO_Interfaces;

import java.util.Properties;

import Properties.PropertiesUtil;

public class DAOutil2 {
	public static Properties prop = null;
	
	static {
		prop = PropertiesUtil.getProperties(DAOutil2.class);
	}
	public static <T> T getObject (String objName) {
		try {
			String classname = prop.getProperty(objName);
			Class<?> clazz = Class.forName(classname);
			return (T)clazz.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
