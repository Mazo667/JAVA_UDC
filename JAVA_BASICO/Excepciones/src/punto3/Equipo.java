package punto3;
import java.io.Serializable;
import java.util.*;

public class Equipo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	
	public Equipo(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private List <Jugador> jugadores = new ArrayList<>();
	
	public void agregarJugador(String nombre,int num) {
		Jugador jugador = new Jugador(nombre,num);
		if(jugadores.size() < 11) {
			jugadores.add(jugador);
		}else {
			System.out.println("Ya hay sufucientes jugadores");
		}
	}
}
