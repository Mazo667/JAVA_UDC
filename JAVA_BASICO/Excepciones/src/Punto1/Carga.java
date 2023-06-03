package Punto1;

public class Carga {
	private Double peso;
	private Double volumen;
	private String nombre;
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Carga(Double p,Double v,String n) {
		this.peso = p;
		this.volumen = v;
		this.nombre = n;
	}
	
}
