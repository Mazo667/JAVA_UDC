package NETWORKING.Cliente_Servidor_Simple;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Socket socket = null;
		
		try {
			//Instanciamos el server con la IP y el port
			socket = new Socket("127.0.0.1",5432);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			//Enviamos un nombre
			oos.writeObject("Pablo");
			//Recibimos la respueta (el saludo personalizado)
			String ret = (String)ois.readObject();
			//Mostramos la respuesta que nos envio el server
			System.out.println(ret);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(ois!=null) ois.close();
			if(oos!=null) oos.close();
			if(socket!=null) socket.close();
		}
	}
}
