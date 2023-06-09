package BaseDeDatosJDBC.AdminstrarConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import Properties.PropertiesUtil;

public class JdbcUtil3 {
	private static Connection con = null;
	private static Properties prop = null;
	
	static {
		prop = PropertiesUtil.getproperties("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/BaseDeDatosJDBC/AdminstrarConexion/JdbcUtilProp.properties");
		try {
			// registramos el driver
			String propName = "jdbc.connection.drv";
			String drv = prop.getProperty(propName);
			Class.forName(drv);
			//Shutdown para cerrar la conexion
			Thread t = new ShutDownHookImple();
			Runtime.getRuntime().addShutdownHook(t);
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public static Connection getConnection() {
		try {
			if(con == null || con.isClosed() ) {
				//url
				String propName="jdbc.connection.url";
				String url = prop.getProperty(propName);
				//usr
				propName="jdbc.connection.usr";
				String usr = prop.getProperty(propName);
				//pwd
				propName="jdbc.connection.pwd";
				String pwd = prop.getProperty(propName);
				con = DriverManager.getConnection(url, usr, pwd);
			}
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}