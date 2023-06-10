package Hilos.Practica.Punto2;

public class Cuenta {
	private int numero;
	private double sueldo;
	
	public Cuenta(int n,double s) {
		this.numero = n;
		this.sueldo = s;
	}
	
	public synchronized void depositar(double deposito) {
		System.out.println("Se esta realizando el deposito de "+ deposito+" pesos");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		this.sueldo = sueldo + deposito;
		System.out.println("El deposito se ha completado correctamente. "
				+ "Su nuevo sueldo es de "+this.sueldo+" pesos");
	}
	
	public synchronized void extraer(double extraccion) throws BancoException{
		if(extraccion < sueldo) {
			System.out.println("Se exta extrayendo "+ extraccion +" pesos");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			this.sueldo = sueldo - extraccion;
			System.out.println("La extraccion se ha completado su nuevo sueldo es de "
					+ this.sueldo + " pesos");
		}else {
			throw new BancoException("Su sueldo no es suficiente");
		}
		
	}

	public int getNumero() {
		return numero;
	}

	public double getSueldo() {
		return sueldo;
	}
	
}
