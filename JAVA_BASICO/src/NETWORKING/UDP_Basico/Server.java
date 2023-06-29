package NETWORKING.UDP_Basico;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class Server {

	public static void main(String[] args) throws IOException {
		//Creo el socket
		DatagramSocket socket = new DatagramSocket(5432);
		
		while (true) {
			System.out.println("Esperando conexion..");
		}
		//buffer para recibir el nombre del cliente
		byte[] buffer = new byte[256];
		//Recibo el nombre del cliente
		DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
		socket.receive(packet);
		
		System.out.println("Conexion recibida");
		//Preparo el saludo para enviar
		String nombre = new String(packet.getData());
		String saludo = "Hola mundo ("+nombre+")_ "+System.currentTimeMillis();
		System.out.print("Voy a enviar: ["+saludo+"]....");
		//buffer para enviar saludo
		byte[] respuesta = saludo.getBytes();
		InetAddress addres = packet.getAddress();
		packet = new DatagramPacket(respuesta,respuesta.length,addres,packet.getPort());
		
		socket.send(packet);
		System.out.println("Saludo enviado!");
	}

}
