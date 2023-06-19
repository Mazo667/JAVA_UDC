package Stream.ReaderYWriters;

import java.io.*;

public class MainReaderTxt {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/Users/MAXIMILIANO/git/JAVA_UDC/JAVA_BASICO/src/Stream/ReaderYWriters/texto.txt");
		Reader r = new InputStreamReader(fis,"UTF-8");
		
		int c;
		while( (c=r.read()) >= 0) {
			System.out.print((char)c);
		}
	}

}
