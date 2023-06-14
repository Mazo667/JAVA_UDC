package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

import java.sql.Date;

public class Venta {
	private int id;
	private Date fecha;
	private int cliente;
	private int cantidad;
	private String producto;
	private double total;
	private String vendedor;
	private int tarjeta;
	
	public Venta() {
		
	}
	public Venta(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public int getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}
	
}

