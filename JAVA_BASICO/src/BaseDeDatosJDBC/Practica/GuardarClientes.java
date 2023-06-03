package BaseDeDatosJDBC.Practica;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GuardarClientes {

	public static void main(String[] args) {
		
		List <Cliente> clientes = new ArrayList<Cliente>();
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
			String sql="SELECT * FROM cliente";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next() ) {
				int dni = rs.getInt("numero_documento");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				Date fecha_nac = rs.getDate("fecha_nacimiento");
				String sexo = rs.getString("sexo");
				String domicilio = rs.getString("domicilio");
				int localidad = rs.getInt("localidad");
				
				clientes.add(new Cliente(dni,nombre,apellido,fecha_nac,sexo,domicilio,localidad));
				//System.out.println("El clinte "+nombre+", "+apellido+
					//	"\t(Se agrego Correctamente)");
			}
			for(Cliente c:clientes) {
				System.out.println(c.getNombre()+", "+c.getApellido());
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
