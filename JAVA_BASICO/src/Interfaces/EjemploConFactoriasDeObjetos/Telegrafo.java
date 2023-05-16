package Interfaces.EjemploConFactoriasDeObjetos;

public class Telegrafo extends Antiguedad implements Comunicador{
	
	public void enviarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
