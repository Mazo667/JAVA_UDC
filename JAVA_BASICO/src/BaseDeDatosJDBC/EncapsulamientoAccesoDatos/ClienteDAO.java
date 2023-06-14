package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import BaseDeDatosJDBC.AdminstrarConexion.JdbcUtil;


public class ClienteDAO {
	public Cliente find(int idCliente) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql="SELECT numero_documento,apellido,nombre,fecha_nacimiento,"
				+ "sexo,domicilio,localidad,total_compras "
				+ "FROM cliente "
				+ "WHERE numero_documento = ? ;";
		
		try {
			Connection con = JdbcUtil.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, idCliente);
			
			rs = pstm.executeQuery();
			
			Cliente cli = null;
			if(rs.next() ) {
				cli = new Cliente();
				cli.setDni(rs.getInt("numero_documento"));
				cli.setApellido(rs.getString("apellido"));
				cli.setNombre(rs.getString("nombre"));
				cli.setFechaNac(rs.getDate("fecha_nacimiento"));
				cli.setLocalidad(rs.getInt("localidad"));
				cli.setSexo(rs.getString("sexo"));
				cli.setTotal_compras(rs.getInt("total_compras"));
				cli.setDomicilio(rs.getString("domicilio"));
			}
			return cli;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstm!=null) pstm.close();
			}catch(Exception e2) {
				e2.printStackTrace();
				throw new RuntimeException(e2);
			}
		}
	}
	public void insertar(Cliente cli) {
		PreparedStatement pstm = null;
		String sql="INSERT INTO cliente "+ ""
				+"(numero_documento,apellido,nombre,fecha_nacimiento,sexo,domicilio,localidad) "+
				"VALUES (?,?,?,?,?,?,?)";
		try {
			Connection con = JdbcUtil.getConnection();
			pstm = con.prepareStatement(sql);
			//Asigno los valores
			pstm.setInt(1,cli.getDni());
			pstm.setString(2, cli.getApellido());
			pstm.setString(3, cli.getNombre());
			pstm.setDate(4, (java.sql.Date) cli.getFechaNac());
			pstm.setString(5, cli.getSexo());
			pstm.setString(6, cli.getDomicilio());
			pstm.setInt(7, cli.getLocalidad());
			//Ejecuto el update
			int rtdo =  pstm.executeUpdate();
			
			if(rtdo==1) {
				System.out.println("El cliente se inserto Correctamente");
			}else {
				throw new RuntimeException("Error en el insert");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}finally {
			try {
				if(pstm!= null) pstm.close();
			}catch(Exception e){
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

}
