package BaseDeDatosJDBC;

import java.sql.*;

public class JDBC_COUNT {

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
			
			String sql="SELECT COUNT(nombre) AS TotalClientes FROM cliente";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
		
			if(rs.next() ) {
				int cantClientes = rs.getInt("TotalClientes");
				System.out.println("Cantidad de clientes: "+ cantClientes);
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
