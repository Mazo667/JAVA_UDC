package BaseDeDatosJDBC.Practica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaBasica {

	public static void main(String[] args) {
		// Imprima un listado de los vendedores con los importes
		//promedio de ventas y la cantidad total de ventas realizadas.
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
			
			String sql="SELECT nombre" +
			",AVG(total) FROM vendedor FULL JOIN venta ON "+
					"vendedor.codigo = venta.vendedor GROUP BY nombre;";
			
			pstm = con.prepareStatement(sql);
			//Ejecuto una Query o Consulta
			rs = pstm.executeQuery();
			
			System.out.println("Nombre  | Promedio de Venta");
			while(rs.next() ) {
				String nombre = rs.getString("nombre");
				Float avg = rs.getFloat("avg");
				System.out.println(nombre+"\t"+avg);
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
