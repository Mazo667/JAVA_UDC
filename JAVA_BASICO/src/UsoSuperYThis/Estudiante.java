package UsoSuperYThis;

public class Estudiante extends Persona{
	private int legajoEstudiante;
	
	public Estudiante(String nombre, int legajoEstudiante) {
		super(nombre); // Llamada al constructor de la clase padre
        this.legajoEstudiante = legajoEstudiante;
    }
    
    public void mostrarInformacion() {
        super.saludar(); // Llamada al método de la clase padre
        System.out.println("Soy estudiante y mi código es " + this.legajoEstudiante);
    }

}
