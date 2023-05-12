package Herencia;

public class Deportivo extends Vehiculo{
	
	private int cilindrada;
	public Deportivo(String patente,String marca,String modelo,String color,double precio,int cilindrada) {
	super(patente, marca, modelo, color); //super invoca al metodo constructor de una clase padre
	this.cilindrada = cilindrada;
	}
	// métodos ‘get’ de la subclase Deportivo
	public int getCilindrada() {
	return this. cilindrada;
	}
	public String getAtributos() {
	return super.getAtributos() +
	", Cilindrada (cm3): " + this.cilindrada;
	}

}
