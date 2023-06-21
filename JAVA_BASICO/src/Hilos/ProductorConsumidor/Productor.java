package Hilos.ProductorConsumidor;

public class Productor extends Thread {
	private Monitor buff;
	private int n;
	private int sleep;
	
	public Productor(Monitor b, int n,int s) {
		//El monitor
		this.buff = b;
		//Cuantos caracteres debe producir
		this.n = n;
		//Cuanto tiempo dormir entre caracter y caracter
		this.sleep = s;
	}
	public void run() {
		try {
			char c;
			for (int i = 0;i<n;i++) {
				c = (char) ('A' + i);
				buff.poner(c);
				System.out.println("Produje: "+c);
				sleep( (int) (Math.random()*sleep));
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
