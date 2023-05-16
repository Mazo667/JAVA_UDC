package MetodosDeLaClase;

public class Numero {
	//Atributo de la clase
	private double valor;
	
	public Numero(double d) {
		valor = d;
	}
	//Constructor de la Clase
	public Numero sumar(double a) {
		valor+=a;
		return this;
	}
	@Override
	public String toString() {
		return Double.toString(valor);
	}
	public static double sumar (double a, double b) {
		return a+b;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
