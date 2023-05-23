package BaseDeDatosJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_AutoIncrementar {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			// el driver
			String drv = "org.postgresql.Driver";
			//la cadena de conexion
			String url = "jdbc:postgresql://127.0.0.1:5432/Inventario";
			//usuario de la base de datos
			String usr= "postgres";
			//password
			String pwd= "admin";
			//registro el driver
			Class.forName(drv);
			//establezco la conexion
			con = DriverManager.getConnection(url, usr, pwd);
			
			String nombreProducto = "Chaleco";
			
			String sql="INSERT INTO producto (nombre) VALUES (?)";
			//al crear el statement le indicamos que queremos el id
			pstm = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			//asigno el valor de la descripcion
			pstm.setString(1, nombreProducto);
			//ejecuto el update
			int rtdo = pstm.executeUpdate();
			
			if(rtdo == 1) {
				System.out.println("La fila se inserto correctamente");
			}else {
				System.out.println("Ocurrio un error");
			}
			
			ResultSet rsd = pstm.getGeneratedKeys();
			if(rsd.next()) {
				int id = rsd.getInt(1);
				System.out.println("id= "+id);
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
