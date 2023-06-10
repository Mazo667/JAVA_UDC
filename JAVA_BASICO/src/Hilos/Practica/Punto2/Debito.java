package Hilos.Practica.Punto2;

public class Debito extends Thread{
	private int numeroCuenta;
	private double monto;
	
	public Debito(int num,double m) {
		this.numeroCuenta = num;
		this.monto = m;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public double getMonto() {
		return monto;
	}
	
}
