package Herencia;

public class Vehiculo {
	String patente;
	String marca;
	String modelo;
	String color;
	
	public Vehiculo(String patente, String marca, String modelo, String color) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAtributos() {
		return "Marca " + marca + ", Modelo " + modelo + ", Color: " + color + ", Patente: " + patente;
	}
	
}
