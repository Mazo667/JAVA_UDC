package Interfaces.EjemploConFactoriasDeObjetos;

public class ComunicadorManager {
	
	//Obtendremos una instancia de Comunicador para enviar un mensaje a traves de esta
	public static Comunicador crearComunicador() {
		//una paloma mensajera es un comunicador
		return new PalomaMensajera();
	}
}
