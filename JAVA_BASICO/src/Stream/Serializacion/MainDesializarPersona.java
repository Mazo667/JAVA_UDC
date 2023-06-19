package Stream.Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDesializarPersona {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/Stream/Serializacion/persona.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			Object x;
			while( (x=ois.readObject()) != null) {
				System.out.println(x);
			}
		}catch(Exception e) {
			System.out.println("Fin del Archivo");
		}
		ois.close();
		fis.close();
	}

}
