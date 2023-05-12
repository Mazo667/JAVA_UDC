package Patron_De_Diseño_Singleton;

public class PersonaSynchronized {
	//Atributos
    private String nombre;
    private static PersonaSynchronized personita;
    	//El constructor es privado, no permite que se genere un constructor por defecto.
    private PersonaSynchronized(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }
    public static PersonaSynchronized getInstance(String nombre) {
        if (personita == null) {
            synchronized (Persona.class) {
                if (personita == null) {
                    personita = new PersonaSynchronized(nombre);
                }
            }
        } else {
            System.out.println("No se puede crear el objeto " + nombre + " porque ya existe un objeto de la clase Persona");
        }
        return personita;
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static PersonaSynchronized getPersonita() {
		return personita;
	}
	public static void setPersonita(PersonaSynchronized personita) {
		PersonaSynchronized.personita = personita;
	}

}
