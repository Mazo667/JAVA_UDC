package ANNOTATIONS;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;



public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Formato(value="dd-mm-aaaa")
	public String toString() {
		try {
			//Obtendremos la clase y el metodo
			Class<?> clazz = getClass();
			Method mtd = clazz.getMethod("toString");
			//Obtendremos la annotation y accedemos al valor
			Formato annFormato=mtd.getAnnotation(Formato.class);
			String s = annFormato.value();
			//Ahora construimos la representacion de la fecha
			s = StringUtils.replace(s,"aaaa",Integer.toString(anio));
			s = StringUtils.replace(s,"mm",Integer.toString(mes));
			s = StringUtils.replace(s,"dd",Integer.toString(dia));
			return s;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public Fecha(int dia,int mes, int anio) {
		this.anio = anio;
		this.dia = dia;
		this.mes = mes;
	}
}
