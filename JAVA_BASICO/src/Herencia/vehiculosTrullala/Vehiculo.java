public abstract class Vehiculo implements VehiculoTrulala{
	private String patente;
	private String marca;
	private String modelo;
	private Double valor;
	private int añoFabricacion;
	private Persona propietario;
	
	public Vehiculo(String pat,String mar,String mod,Double valor,int año,Persona prop) {
		this.patente = pat;
		this.marca = mar;
		this.modelo = mod;
		this.valor = valor;
		this.añoFabricacion = año;
		this.propietario = prop;
	}
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public int getAñoFabricacion() {
		return this.añoFabricacion;
	}
}
