package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

public class MainDatosForaneos {

	public static void main(String[] args) {
		//Obtenemos la instancia de cliente
				ClienteDAO clientedao = new ClienteDAO();
				int idCliente = 32220094;
				Cliente cliente = clientedao.find(idCliente);
				System.out.println("Cliente: " + cliente.getDni()+" Nombre: " +cliente.getApellido()+" "+cliente.getNombre());
				//Obtenemos la instancia de Venta
				VentaDAO ventadao = new VentaDAO();
				int VentaCli = cliente.getDni();
				Venta venta = ventadao.find(VentaCli);
				System.out.println("Venta_Cliente: "+venta.getCliente()+", Producto: "+venta.getProducto());
	}

}
