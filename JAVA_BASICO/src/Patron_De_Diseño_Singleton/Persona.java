package Patron_De_Diseño_Singleton;

public class Persona {
	//Atributos
    private String nombre;
    private static Persona personita;
    	//El constructor es privado, no permite que se genere un constructor por defecto.
    private Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }
	//Metodo Singleton
    public static Persona getSingletonInstance(String nombre) {
        if (personita == null){
            	personita = new Persona(nombre);
        }
        else{
            	System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase persona");
        }
              return personita;
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Persona getPersonita() {
		return personita;
	}
	public static void setPersonita(Persona personita) {
		Persona.personita = personita;
	}

}
