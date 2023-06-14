package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import BaseDeDatosJDBC.AdminstrarConexion.JdbcUtil;

public class VentaDAO {
	public Venta find(int idCliente) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql="SELECT id,fecha,cliente,cantidad,producto,"
				+ "total,vendedor,tarjeta "
				+ "FROM venta "
				+ "WHERE cliente = ? ;";
		
		try {
			Connection con = JdbcUtil.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, idCliente);
			
			rs = pstm.executeQuery();
			
			Venta venta = null;
			if(rs.next() ) {
				venta = new Venta();
				venta.setCantidad(rs.getInt("cantidad"));
				venta.setCliente(rs.getInt("cliente"));
				venta.setFecha(rs.getDate("fecha"));
				venta.setId(rs.getInt("id"));
				venta.setTarjeta(rs.getInt("tarjeta"));
				venta.setProducto(rs.getString("producto"));
				venta.setTotal(rs.getDouble("total"));
				venta.setVendedor(rs.getString("vendedor"));
			}
			return venta;
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
}
