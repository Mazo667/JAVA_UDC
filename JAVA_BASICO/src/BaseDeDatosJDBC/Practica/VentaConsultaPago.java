package BaseDeDatosJDBC.Practica;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
			
			//Seteo la fecha que quiero obtener
			GregorianCalendar gc = new GregorianCalendar();
			gc.set(Calendar.YEAR,2015);
			gc.set(Calendar.MONTH,8-1);
			gc.set(Calendar.DAY_OF_MONTH,01);
			
			long ts = gc.getTimeInMillis();
			Date fecha = new Date(ts);
			//Codigo Vendedor
			String vendedor = "JUA";//Efectivo
			String vendedor2 = "GOM";//Tarjeta
			
			//Llamamos al metodo para hacer la consulta
			ConsultaPago(con,vendedor2,fecha);
			
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

	private static void ConsultaPago(Connection con,String vendedor,Date d) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT vendedor.nombre, venta.fecha, COALESCE(tarjeta.nombre, 'EFECTIVO') AS tarjeta FROM venta "
					+ "JOIN vendedor ON venta.vendedor = vendedor.codigo "
					+ "LEFT JOIN tarjeta ON venta.tarjeta = tarjeta.codigo "
					+ "WHERE vendedor.codigo = ? AND venta.fecha = ? ;";
			pstm = con.prepareStatement(sql);
			pstm.setDate(2, d);
			pstm.setString(1, vendedor);
			System.out.println(con.getClass().getCanonicalName());
			//Ejecuto el Update
			rs = pstm.executeQuery();
			
			System.out.println("Nombre			| Fecha Venta			| Metodo de Pago");
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				Date fecha = rs.getDate("fecha");
				String pago = rs.getString("tarjeta");
				System.out.println(nombre+"		"+fecha+"		"+pago);
			}
			
		}catch(Exception e) {
			   e.printStackTrace();
		        
		}finally {
			 // Cierro el PreparedStatement
	        if (pstm != null) {
	            try {
	                pstm.close();
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
		}
	}
}