package Comparator.EjemploVehiculos;

public class Vehiculos implements Comparable <Vehiculos>{
	private String marca;
	private String modelo;
	private String patente;
	private Double precio;
	private int antiguedad;
	
	//getters y setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public Vehiculos(String marca,String modelo,String patente,Double precio,int antiguedad) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.precio = precio;
		this.antiguedad = antiguedad;
	}
	
	
	@Override
	public int compareTo(Vehiculos o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
