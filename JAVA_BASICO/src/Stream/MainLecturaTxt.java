package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainLecturaTxt {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			//Cambiamos el estandar output
			fis = new FileInputStream("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/Stream/salida.txt");
			System.setIn(fis);
			Scanner scanner = new Scanner(System.in);
			
			while(scanner.hasNext()) {
				String s = scanner.next();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fis.close();
		}
		
	}

}
