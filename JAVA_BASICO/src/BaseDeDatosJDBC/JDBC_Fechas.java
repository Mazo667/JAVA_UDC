package BaseDeDatosJDBC;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JDBC_Fechas {

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
			String sql="SELECT fecha,producto,vendedor "
					+ "FROM venta WHERE fecha <= ? AND vendedor = ?";
			
			pstm = con.prepareStatement(sql);
			
		//Asignamos un valor para el parametro numero 1
			GregorianCalendar gc = new GregorianCalendar();
			gc.set(Calendar.YEAR,2016);
			gc.set(Calendar.MONTH,12);
			gc.set(Calendar.DAY_OF_MONTH,31);
			
			long ts = gc.getTimeInMillis();
			Date d = new Date(ts);
			
			pstm.setDate(1, d);
			pstm.setString(2, "JUA");
			rs = pstm.executeQuery();
			
			System.out.println("fecha | producto | vendedor");
			while(rs.next() ) {
				Date fecha = rs.getDate("fecha");
				String nombre = rs.getString("producto");
				String vendedor = rs.getString("vendedor");
				System.out.println(fecha+",  "+nombre+", "+vendedor);
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
