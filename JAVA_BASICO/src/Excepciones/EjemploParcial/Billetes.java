package Excepciones.EjemploParcial;

public enum Billetes {
	cinco(5),
	diez(10),
	veinte(20),
	cincuenta(50),
	cien(100),
	doscientos(200),
	quinientos(500);

	private int valor;
	
	private Billetes( int i) {
		this.valor = i;
	}
	
	public int getValor() {
		return valor;
	}
	
}
