package BaseDeDatosJDBC.AdminstrarConexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	//Utilizamos SINGLETON para garantizar una unica instancia de la conexion
	private static Connection con = null;
	public static Connection getConnection() {	
		try {
			//nos aseguramos si la conexion es nula o esta cerrada
			if(con==null || con.isClosed()) {
				//Tambien podremos cargar los datos con Properties
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
			//Con esto podremos instanciar la conexion sin la necesidad de escribir
			//todas las lineas
			con = DriverManager.getConnection(url, usr, pwd);
			}
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
