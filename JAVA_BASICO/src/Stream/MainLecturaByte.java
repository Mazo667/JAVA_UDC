package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class MainLecturaByte {

	public static void main(String[] args) throws IOException {
		//Abrimos el archivo
		FileInputStream fis = new FileInputStream("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/Stream/miTexto.txt");
		//Recorremos leyendo byte por byte
		int b;
		while( (b=fis.read()) >=0) {
			char c = (char)b;
			System.out.print(c);
		}
		fis.close();
	}
}
