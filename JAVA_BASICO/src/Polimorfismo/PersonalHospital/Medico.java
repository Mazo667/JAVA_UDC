public class Medico extends PersonalHospital{
	
	public Medico(String nombre, String trabajo) {
		super(nombre,trabajo);
	}
	
	@Override
	public void presentarse() {
		System.out.println("Mi nombre es "+super.nombre+" y soy "+super.trabajo);
	}
	
}
