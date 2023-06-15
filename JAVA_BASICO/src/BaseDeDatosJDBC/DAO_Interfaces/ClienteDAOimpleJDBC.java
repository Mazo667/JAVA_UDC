package BaseDeDatosJDBC.DAO_Interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import BaseDeDatosJDBC.AdminstrarConexion.JdbcUtil;
import BaseDeDatosJDBC.EncapsulamientoAccesoDatos.Cliente;

public class ClienteDAOimpleJDBC implements ClienteDAO{
	@Override
	public Cliente find(int idCliente) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Connection con = JdbcUtil.getConnection();
			String sql="SELECT numero_documento,apellido,nombre,fecha_nacimiento,"
					+ "sexo,domicilio,localidad,total_compras "
					+ "FROM cliente "
					+ "WHERE numero_documento = ? ;";
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
		}catch (Exception e) {
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
}
