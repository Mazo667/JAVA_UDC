package BaseDeDatosJDBC.Practica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaBasica2 {

	public static void main(String[] args) {
		//Informe el ranking de los diez mejores clientes.
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
			
			String sql= "SELECT nombre,SUM(total) FROM cliente "+
					"JOIN venta ON cliente.numero_documento = venta.cliente "+
					"GROUP BY cliente.nombre ORDER BY sum DESC LIMIT 10;";
			
			pstm = con.prepareStatement(sql);
			//Ejecuto una Query o Consulta
			rs = pstm.executeQuery();
			
			System.out.println("Nombre  | Total de Compras");
			while(rs.next() ) {
				String nombre = rs.getString("nombre");
				Float sum = rs.getFloat("sum");
				System.out.println(nombre+"\t"+sum);
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
