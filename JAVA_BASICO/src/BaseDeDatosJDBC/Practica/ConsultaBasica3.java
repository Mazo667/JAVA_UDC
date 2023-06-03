package BaseDeDatosJDBC.Practica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaBasica3 {

	public static void main(String[] args) {
		//Informe el total de ventas por localidad.
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
			
			String sql= "SELECT localidad.nombre,SUM(total) FROM VENTA "+
						"JOIN cliente ON venta.cliente = cliente.numero_documento "+
						"JOIN localidad ON cliente.localidad = localidad.codigo "+
						"GROUP BY localidad.nombre;";

			
			pstm = con.prepareStatement(sql);
			//Ejecuto una Query o Consulta
			rs = pstm.executeQuery();
			
			System.out.println("Localidad  | Total de Ventas");
			while(rs.next() ) {
				String local = rs.getString("nombre");
				Float sum = rs.getFloat("sum");
				System.out.println(local+"\t\t"+sum);
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
