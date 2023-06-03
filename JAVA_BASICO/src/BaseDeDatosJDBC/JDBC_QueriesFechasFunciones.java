package BaseDeDatosJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JDBC_QueriesFechasFunciones {

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
			String sql="SELECT fecha,producto FROM venta WHERE fecha <= CURRENT_DATE;";
			pstm = con.prepareStatement(sql);
	
			rs = pstm.executeQuery();
			
			System.out.println("FECHA | PRODUCTO");
			while(rs.next() ) {
				Date fecha = rs.getDate("fecha");
				String producto = rs.getString("producto");
				System.out.println(fecha+",  "+producto);
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
