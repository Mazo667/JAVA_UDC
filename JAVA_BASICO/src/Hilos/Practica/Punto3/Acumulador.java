package Hilos.Practica.Punto3;

public class Acumulador extends Thread{
	private Contenedor contenedor;
	private int suma;
	
	public Acumulador(Contenedor contenedor) {
		this.contenedor = contenedor;
		this.suma = 0;
	}
	
	public void run() {
		Integer valor;
		while((valor = contenedor.getProximo()) != null) {
			System.out.print("El hilo"
			+" ("+Thread.currentThread()+") "+"esta acumulando el valor de "
			+valor+" \n");
			suma += valor;
		}
	}
}
