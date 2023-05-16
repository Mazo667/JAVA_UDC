package Properties;

import java.util.Properties;

public class EjemploBasicoProperties {

	public static void main(String[] args) {
		//Declaramos una instancia de Properties
		Properties prop = new Properties();
		
		//Asignamos propiedades y valores
		prop.setProperty("nombre","Maximiliano");
		prop.setProperty("apellido", "Fava");
		prop.setProperty("FechaNacimiento", "19/8/1992");
		prop.setProperty("dni", "41324187");
		prop.setProperty("direccion", "Almafuerte 1878");
		
		//Obtendremos el valor de una propiedad
		String dir = prop.getProperty("direccion");
		System.out.println(dir);
		
		//Intentamos leer una propiedad que no existe
		String edad = prop.getProperty("edad");
		System.out.println(edad);
	}

}
