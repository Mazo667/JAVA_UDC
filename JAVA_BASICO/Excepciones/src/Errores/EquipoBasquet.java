package Errores;

import java.util.LinkedList;
import java.util.List;

public class EquipoBasquet {

	public List<Jugador> jugadores = new LinkedList<>();
			
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public void addJugador(Jugador jugador) {
		if(jugadores.size() > 5) {
			throw new ValorInvalidoException("Son demasiados jugadores");
		}else {
			jugadores.add(jugador);
		}
	
	}
	
}
