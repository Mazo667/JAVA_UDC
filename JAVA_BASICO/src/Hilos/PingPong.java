package Hilos;

public class PingPong extends Thread{
	private String palabra;
	
	public PingPong(String p) {
		this.palabra = p;
	}
	
	public void run() {
		for(int i = 0;i < 3000;i++) {
			System.out.println(palabra);
			System.out.flush();
		}
	}
	
	
	public static void main(String[] args) {
		Thread ping = new PingPong("Ping");
		Thread pong = new PingPong("Pong");
		ping.start();
		pong.start();

	}

}
