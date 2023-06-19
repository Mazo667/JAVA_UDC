package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MainErrorTxt {
	public static void main(String[] args) throws IOException {
			FileOutputStream fos = new FileOutputStream("/home/maximiliano/git/JAVA_UDC/JAVA_BASICO/src/Stream/error.txt");
			System.setErr(new PrintStream(fos));
			
			double a = 5/0;
			System.out.println(a);
			
			fos.close();
	}
}
