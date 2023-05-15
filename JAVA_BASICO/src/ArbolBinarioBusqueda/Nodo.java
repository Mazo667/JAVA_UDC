package ArbolBinarioBusqueda;

public class Nodo {
	private int dato;
	private Nodo izquierdo, derecho;
	
	public Nodo(int dato) {
		this.dato = dato;
		this.izquierdo = null;
		this.derecho = null;
	}
	
	public void imprimirDato() {
		System.out.println(this.getDato());
	}
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getIzquierdo() {
		return izquierdo;
	}
	public void setIzquierdo(Nodo izquierdo) {
		this.izquierdo = izquierdo;
	}
	public Nodo getDerecho() {
		return derecho;
	}
	public void setDerecho(Nodo derecho) {
		this.derecho = derecho;
	}
	
	
}
