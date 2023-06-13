package Hilos.Practica.Punto3;

public class MainContenedor {

	public static void main(String[] args) {
		Contenedor contenedor = new Contenedor();
		Acumulador acumulador1 = new Acumulador(contenedor);
		Acumulador acumulador2 = new Acumulador(contenedor);
		Acumulador acumulador3 = new Acumulador(contenedor);
		
		acumulador1.start();
		acumulador2.start();
		acumulador3.start();
		System.out.println(contenedor.cantidad());

	}

}
