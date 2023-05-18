package ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;


public class EmpleadoDesarializacion {
public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		InputStream is = new FileInputStream("empleado.data");
		ObjectInputStream ois = new ObjectInputStream (is);
		Persona empleado = (Persona) ois.readObject();
		
		System.out.println(empleado.getNombre()+ " "+ empleado.getApellido() + " edad: "+ empleado.getEdad());
		
	}

}
