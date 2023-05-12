package Patron_De_Diseño_Singleton;

public class Main {

	public static void main(String[] args) {
		//creó dos objetos de la clase persona
		Persona ricardo = Persona.getSingletonInstance("Ricardo Moya");
		Persona ramon = Persona.getSingletonInstance("Ramón Invarato");
		 	//la segunda persona no se creará por que ya hay una
		        System.out.println(ramon.getNombre());
		        System.out.println(ricardo.getNombre());
//utilizamos getInstance() para asegurar que solo un hilo pueda acceder a ese codigo, asi evitando problemas de concurrencia
		        System.out.println("\nMetodo Synchronized");
		PersonaSynchronized pedro = PersonaSynchronized.getInstance("Pedro Sanchez");
		PersonaSynchronized raul = PersonaSynchronized.getInstance("Raul Alvarez");

	}

}
