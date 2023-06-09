package BaseDeDatosJDBC.EncapsulamientoAccesoDatos;

import java.util.Date;

public class Cliente {
	private int dni;
	private String apellido;
	private String nombre;
	private Date fechaNac;
	private String sexo;
	private String domicilio;
	private int localidad;
	private int total_compras;
	
	public Cliente() {
		
	}
	public Cliente(int id) {
		this.dni=id;
	}
	
	public boolean equals(Object o) {
		return((Cliente)o).dni==this.dni;
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
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
	public int getTotal_compras() {
		return total_compras;
	}
	public void setTotal_compras(int total_compras) {
		this.total_compras = total_compras;
	}
}
