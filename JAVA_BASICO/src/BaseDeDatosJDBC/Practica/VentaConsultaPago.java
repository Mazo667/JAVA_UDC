package BaseDeDatosJDBC.Practica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentaConsultaPago {
	
	

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
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
			//establezco la conexion
			con = DriverManager.getConnection(url, usr, pwd);
		//Los valores paramatrizados se representan con signos de interrogacion
			String sql="SELECT * FROM localidad WHERE nombre LIKE ?";
			pstm = con.prepareStatement(sql);
		//Asignamos un valor para el parametro numero 1
			pstm.setString(1, "TRELEW%");
			rs = pstm.executeQuery();
			
			System.out.println("codigo | nombre");
			while(rs.next() ) {
				int codigo = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				System.out.println(codigo+",  "+nombre);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			try {
				if(rs!= null) rs.close();
				if(pstm!= null) pstm.close();
				if(con != null) con.close();
			}catch(Exception e){
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}
