public abstract class PersonalHospital {
	protected String nombre;
	protected String trabajo;
	
	public PersonalHospital(String nombre,String trabajo) {
		this.nombre = nombre;
		this.trabajo = trabajo;
	}
	
	public abstract void presentarse();
	
	public String getNombre() {
		return nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}
	
}
