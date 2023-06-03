package BaseDeDatosJDBC.Practica;

import java.sql.Date;

public class Cliente {
	private int dni;
	private String apellido;
	private String nombre;
	private Date fecha_nac;
	private String sexo;
	private String domicilio;
	private int localidad;
	
	public Cliente(int dni,String apellido,String nombre,Date fecha_na,String sexo,String dom,int local) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fecha_nac = fecha_na;
		this.sexo = sexo;
		this.domicilio = dom;
		this.localidad = local;
	}
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getLocalidad() {
		return localidad;
	}
	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}
	
}
