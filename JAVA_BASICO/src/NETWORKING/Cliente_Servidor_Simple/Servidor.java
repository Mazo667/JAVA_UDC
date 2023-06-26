package NETWORKING.Cliente_Servidor_Simple;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		//Instanciamos ServerSocket indicando en que puerto atendera
		ServerSocket serverSocket = new ServerSocket(5432);
		Socket socket = null;
		
		while(true) {
			try {
				//Blockeante: solo pasamos cuando llega un cliente
				socket = serverSocket.accept();
				//informacion en la consola
				String ip = socket.getInetAddress().toString();
				System.out.println("Se conectaron desde la IP: "+ip);
				//Enmascaramos la entrada y salida de bytes
				ois = new ObjectInputStream(socket.getInputStream());
				oos = new ObjectOutputStream(socket.getOutputStream());
				//Leemos el nombre que envia el cliente
				String nom = (String)ois.readObject();
				//Confeccionamos las salidas que le vamos a enviar
				long ts = System.currentTimeMillis();
				String saludo = "Hola, "+nom+" ("+ts+")";
				//Se lo enviamos al cliente
				oos.writeObject(saludo);
				System.out.println("Saludo enviado...");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(oos!=null) oos.close();
				if(ois!=null) ois.close();
				if(socket!=null) socket.close();
				System.out.println("Conexion Cerrada");
			}
		}
	}
}
