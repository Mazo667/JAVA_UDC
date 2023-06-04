package BaseDeDatosJDBC.AdminstrarConexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	public static Connection getConnection() {		
		try {
			// el driver
			String drv = "org.postgresql.Driver";
			//la cadena de conexion
			String url = "jdbc:postgresql://127.0.0.1:5432/ventas";
			//usuario de la base de datos
			String usr= "postgres";
			//password
			String pwd= "admin";
			//registro el driver
			Class.forName(drv);
			return DriverManager.getConnection(url,usr,pwd);
			//Con esto podremos instanciar la conexion sin la necesidad de escribir
			//todas las lineas
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
