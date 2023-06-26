package NETWORKING.UDP_Basico;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {
	public static void main(String[] args) throws IOException {
		//Instancia un DatagramSocket
		DatagramSocket datagramSocket = new DatagramSocket();
		//buffer con info a enviar
		byte[] mensaje = "Pablo".getBytes();
		//IP del server
		byte[] ip = { 127,0,0,1 };
		InetAddress address = InetAddress.getByAddress(ip);
		int port = 5432;
		//Paquete de informacioon a enviar, ip + port (5432)
		DatagramPacket packet = new DatagramPacket(mensaje,mensaje.length,address,port);
		//Envio del paquete
		datagramSocket.send(packet);
		//buffer para recibir la respuesta
		byte[] respuesta = new byte[256];
		packet = new DatagramPacket(respuesta,respuesta.length,address,5432);
		//recibo el saludo
		datagramSocket.receive(packet);
		//muestro el resultado
		String saludo = new String(packet.getData());
		System.out.println(saludo);
		datagramSocket.close();
	}
}
