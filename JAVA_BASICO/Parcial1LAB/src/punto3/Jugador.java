package punto3;

import java.io.Serializable;

public class Jugador implements Serializable{
	private String nombre;
	private int numero;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Jugador(String nom, int num) {
		this.nombre = nom;
		this.numero = num;
	}
}
