package ejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class EmpleadoSerializacion {
	
	public static void main(String[] args) throws IOException {

	Persona empleado = new Persona();
	empleado.setNombre("Maximiliano");
	empleado.setApellido("Fava");
	empleado.setEdad(24);

	//abrir 
	FileOutputStream archivo = new FileOutputStream("empleado.data");
	ObjectOutputStream salida = new ObjectOutputStream(archivo);
	//guardar 
		salida.writeObject(empleado);
		
		salida.close();
		
	}
	
}
