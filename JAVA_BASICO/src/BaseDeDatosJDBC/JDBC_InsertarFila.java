package BaseDeDatosJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JDBC_InsertarFila {

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
			
			String sql="INSERT INTO cliente "+ ""
					+"(numero_documento,apellido,nombre,fecha_nacimiento,sexo,domicilio,localidad) "+
					"VALUES (?,?,?,?,?,?,?)";
			pstm = con.prepareStatement(sql);
			GregorianCalendar gc = new GregorianCalendar();
			gc.set(Calendar.YEAR,1998);
			gc.set(Calendar.MONTH,8-1);
			gc.set(Calendar.DAY_OF_MONTH,19);
			
			long ts = gc.getTimeInMillis();
			Date d = new Date(ts);
			//Asigno los valores a los parametros
			pstm.setInt(1,41324177);
			pstm.setString(2,"FAVA");
			pstm.setString(3, "MAXIMILIANO");
			pstm.setDate(4, d);
			pstm.setString(5, "M");
			pstm.setString(6, "CANDIDO LOPEZ 1012");
			pstm.setInt(7, 64);
			//Ejecuto el update
			int rtdo = pstm.executeUpdate();
			
			if(rtdo == 1) {
				System.out.println("La fila se registro correctamente");
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
