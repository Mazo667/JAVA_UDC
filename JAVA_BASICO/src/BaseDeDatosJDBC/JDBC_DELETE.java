package BaseDeDatosJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_DELETE {

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
			
			String sql="DELETE FROM cliente WHERE numero_documento = ? ";
			
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, 41324177);
			
			//Ejecuto el update
			int rtdo = pstm.executeUpdate();
			
			if(rtdo == 1) {
				System.out.println("La fila se borro correctamente");
			}else {
				System.out.println("Ocurrio un error");
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
