package BaseDeDatosJDBC.AdminstrarConexion;

import java.sql.Connection;

public class ShutDownHookImple extends Thread{
	public void run() {
		try {
			Connection con = JdbcUtil.getConnection();
			con.close();
			System.out.println("Adios");
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
