package Interfaces;

public class Main_Ejemplo_Interfaces {

	public static void main(String[] args) {
        Celular miCelular = new Celular();
        miCelular.encender();
        miCelular.hacerLlamada("3487 225544"); // Llamada exitosa
        miCelular.apagar();
        miCelular.hacerLlamada("3487 78741"); // Intento de llamada en un celular apagado   
	}

}
