package Hilos.Practica.Punto1;

public class MainBañoQuimico {

	public static void main(String[] args) {
		BañoQuimico baño = new BañoQuimico();
		String[] nombres = {"Sandra", "Mariana", "Paola", "Laura",
				"Sabrina"};
		
		for(int i = 0;i < nombres.length;i++) {
			Thread fan = new FansLuisMiguel(nombres[i], baño);
	        fan.start();
		}

	}

}
