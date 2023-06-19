package Stream.Serializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class MainSerializarPersona {

	public static void main(String[] args)  {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/Stream/Serializacion/persona.dat");
			oos = new ObjectOutputStream(fos);
			//Grabamos el valor de Pi
			oos.writeObject("El valor de Pi es: ");
			oos.writeObject(3.14);
			
			//Grabamos un Gregorian Calendar y una persona
			oos.writeObject(new GregorianCalendar(2023,6,19));
			oos.writeObject(new Persona("Pedro",25));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
