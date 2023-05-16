package Interfaces.EjemploConFactoriasDeObjetos;

public class TelefonoCelular extends Telefono	implements Comunicador{
	
	public void enviarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
