package BaseDeDatosJDBC;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class JDBC_INSERT {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			String drv = "org.postgresql.Driver";
			String url = "jdbc:postgresql://127.0.0.1:5432/ventas";
			String usr= "postgres";
			String pwd= "admin";
			Class.forName(drv);
			con = DriverManager.getConnection(url, usr, pwd);
			//Creo las variables de los archivos que voy a crear
			int nuevoDni = 41324177;
			String nuevoApellido = "Fava";
			String nuevoNombre = "Maximiliano";
			String nuevoSe = "M";
			String nuevoDOM = "Candido Lopez 1012";
			int nuevoLOC = 64;
			GregorianCalendar gc = new GregorianCalendar();
			gc.set(Calendar.YEAR,2016);
			gc.set(Calendar.MONTH,12);
			gc.set(Calendar.DAY_OF_MONTH,31);
			
			long ts = gc.getTimeInMillis();
			Date nuevoNAC = new Date(ts);
			
			
			
			String sql="INSERT INTO cliente (numero_documento,apellido,nombre,"
					+ "fecha_nacimiento,sexo,domicilio,localidad) "
					+ "VALUES (?,?,?,?,?,?,?) ";
			
			
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, 41324188);;
			pstm.setString(2, nuevoApellido);
			pstm.setString(3,nuevoNombre);
			pstm.setDate(4,nuevoNAC);
			pstm.setString(5, nuevoSe);
			pstm.setString(6, nuevoDOM);
			pstm.setInt(7, nuevoLOC);
			
			int rtdo = pstm.executeUpdate();
			
			if(rtdo ==1) {
				System.out.println("La fila se inserto correctamente");
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
