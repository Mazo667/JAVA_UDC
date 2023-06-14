package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

import java.util.List;

public class MainColeccion {

	public static void main(String[] args) {
		VentaDAO dao = new VentaDAO();
		int idCliente = 32220094;
		List<Venta> ventas = dao.findByDniCliente(idCliente);
		
		for(Venta ven: ventas) {
			System.out.println("Producto: "+ven.getProducto()+", cantidad: "+ven.getCantidad()+", Total: "+ven.getTotal());
		}

	}

}
