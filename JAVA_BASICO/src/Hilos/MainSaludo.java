package Hilos;

public class MainSaludo {

	public static void main(String[] args) throws InterruptedException {
		Saludo s1 = new Saludo("Pablo");
		Saludo s2 = new Saludo("Maximiliano");
		Saludo s3 = new Saludo("Sofia");
		s1.start();
		s2.start();
		s3.start();
		
		s1.join();
		s2.join();
		s3.join();
		
		System.out.println("Finalizo el Programa");
	}
}
