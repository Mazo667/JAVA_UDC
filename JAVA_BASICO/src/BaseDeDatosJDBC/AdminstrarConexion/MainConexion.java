package BaseDeDatosJDBC.AdminstrarConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainConexion {

	public static void main(String[] args) {
		try {
			Connection con = JdbcUtil2.getConnection();
			
			String sql="SELECT apellido,nombre FROM cliente";
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			System.out.println("apellido | nombre");
			while(rs.next() ) {
				String apellido = rs.getString("apellido");
				String nombre = rs.getString("apellido");
				System.out.println(apellido+",  "+nombre);
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	
	}

}
