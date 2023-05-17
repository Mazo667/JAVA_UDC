package Errores9;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			Persona persona = Persona.getPersona("MAX");
			System.out.println("La persona ingresada es: " + persona.getNombre());
		} catch (NombreErroneoException ex) {
			System.err.println(ex.getMessage());
		}

	}


}
