package Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MainEscrituraTxt {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
			//Cambiamos el estandar output
			fos = new FileOutputStream("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/Stream/salida.txt");
			System.setOut(new PrintStream(fos));
			//imprimimos el estandar output
			System.out.println("Holaa");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fos.close();
		}

	}

}
