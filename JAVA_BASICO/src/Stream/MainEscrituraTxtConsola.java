package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainEscrituraTxtConsola {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String s = scanner.nextLine();
		FileOutputStream fos = null;
		try {
			//Abrimos el archivo
			fos = new FileOutputStream("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/Stream/miTexto.txt");
			byte[] bytes = s.getBytes();
			
			for (int i = 0;i < bytes.length; i++ ) {
				fos.write(bytes[i]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			fos.close();
			scanner.close();
		}
	}
}
