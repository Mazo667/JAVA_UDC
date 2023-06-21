package Hilos;

public class Saludo extends Thread{
	private String nombre;
	public Saludo(String nombre) {
		this.nombre = nombre;
	}
	
	public void run() {
		try {
			int x = (int) (Math.random()*5000);
			Thread.sleep(x);
			System.out.println("Hola "+nombre+", ("+x+" milisegundos)");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
