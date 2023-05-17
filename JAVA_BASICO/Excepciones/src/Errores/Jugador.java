package Errores;
import java.io.BufferedReader;

public class Jugador {

	private String nombre;
	private int edad;
	private double altura;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws ValorInvalidoException{
		if (altura < 1.60) {
			throw new ValorInvalidoException ("Hay un jugador muy petiso");
		}
		this.altura = altura;
	}

	public void setNombre(String nombre) throws ValorInvalidoException {
		if (nombre == null || nombre.trim().isEmpty()){
			throw new ValorInvalidoException ("Debe ingresar un nombre valido");
		}
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws ValorInvalidoException{
		if (edad < 35) {
			throw new ValorInvalidoException("Hay un menor de edad en el equipo");
		}
		this.edad = edad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	private int cantidad;
	
	
	
}
