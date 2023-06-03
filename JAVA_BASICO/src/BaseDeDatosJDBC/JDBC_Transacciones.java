package BaseDeDatosJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JDBC_Transacciones {

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
			//Anulamos el autoComit y tendremos que indicar donde finaliza la transaccion
			con.setAutoCommit(false);
			
			GregorianCalendar gc = new GregorianCalendar();
			gc.set(Calendar.YEAR,1998);
			gc.set(Calendar.MONTH,8-1);
			gc.set(Calendar.DAY_OF_MONTH,19);
			//Obtengo Fecha nacimiento
			long ts = gc.getTimeInMillis();
			Date d = new Date(ts);
			//Demas Datos
			int dni = 41324177;
			String apellido = "FAVA";
			String nombre = "MAXIMILIANO";
			String sexo = "M";
			String domicilio = "CANDIDO LOPEZ 1012";
			int localidad = 64;
			//insertamos la orden para insertar un cliente
			insertarCliente(con,dni,apellido,nombre,sexo,domicilio,localidad,d);
			
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

	private static void insertarCliente(Connection con,int dni, String apellido, String nombre, String sexo, String domicilio,
			int localidad, Date d) {
		PreparedStatement pstm = null;
		try {
			String sql ="INSERT INTO cliente "+ ""
					+"(numero_documento,apellido,nombre,fecha_nacimiento,sexo,domicilio,localidad) "+
					"VALUES (?,?,?,?,?,?,?)";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1,dni);
			pstm.setString(2,apellido);
			pstm.setString(3, nombre);
			pstm.setDate(4, d);
			pstm.setString(5, sexo);
			pstm.setString(6, domicilio);
			pstm.setInt(7, localidad);
			//EJecuto el Update
			int rtdo = pstm.executeUpdate();
			//Verifico el update
			if (rtdo != 1) {
				String mssg = "Error en el cliente = "+" dni: "+" ,"+apellido;
				throw new RuntimeException(mssg);
			}else {
				System.out.println("El cliente se inserto correctamente");
			}
			 // Confirmo la transacción
	        con.commit();
		}catch(Exception e) {
			   e.printStackTrace();
		        // Revierto la transacción en caso de error
		        try {
		            con.rollback();
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		        }
		        throw new RuntimeException(e);
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
