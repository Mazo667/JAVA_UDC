package Hilos.ProductorConsumidor;

public class Monitor {
	private char[] buff = null;
	private int tope = 0;
	private boolean lleno = false;
	private boolean vacio = true;
	
	public Monitor(int capacidad) {
		buff = new char[capacidad];
	}
	public synchronized void poner (char c) throws InterruptedException {
		//Mientras el buffer este lleno nos bloqueamos
		//Para que el consumidor consuma algun caracter
		while(lleno) {
			wait();
		}
		//seccion critica
		buff[tope++] = c;
		vacio = false;
		lleno = tope>=buff.length;
		notifyAll();
	}
	public synchronized char sacar() throws InterruptedException {
		//Mientras el buffer este vacio nos bloqueamos para
		//que el productor pueda producir un caracter
		while(vacio) {
			wait();
		}
		//Seccion Critica
		char c = buff[--tope];
		lleno = false;
		vacio = tope==0;
		notifyAll();
		return c;
	}
}
