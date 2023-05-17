package Errores;


public class Main {

	public static void main(String[] args) {
		Jugador jugador = new Jugador();
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Jugador jugador3 = new Jugador();
		Jugador jugador4 = new Jugador();
		EquipoBasquet equipo = new EquipoBasquet();
		
		try {
			
			jugador.setNombre("Pepe");
			jugador.setEdad(82);
			jugador.setAltura(1.65);
			//System.out.println(jugador.getNombre() + " " +  jugador.getEdad() + " " + jugador.getAltura());
			
			equipo.addJugador(jugador);
			
			jugador1.setNombre("Pedro");
			jugador1.setEdad(72);
			jugador1.setAltura(1.71);
			//System.out.println(jugador1.getNombre() + " " +  jugador1.getEdad() + " " + jugador1.getAltura());
			equipo.addJugador(jugador1);
			
			jugador2.setNombre("Roberto");
			jugador2.setEdad(70);
			jugador2.setAltura(1.70);
			//System.out.println(jugador2.getNombre() + " " +  jugador2.getEdad() + " " + jugador2.getAltura());
			equipo.addJugador(jugador2);
			
			jugador3.setNombre("Jose");
			jugador3.setEdad(69);
			jugador3.setAltura(1.91);
			//System.out.println(jugador2.getNombre() + " " +  jugador2.getEdad() + " " + jugador2.getAltura());
			equipo.addJugador(jugador3);
			
			jugador4.setNombre("Javier");
			jugador4.setEdad(62);
			jugador4.setAltura(1.60);
			//System.out.println(jugador3.getNombre() + " " +  jugador3.getEdad() + " " + jugador3.getAltura());
			equipo.addJugador(jugador4);
			
			for (int i = 0;i < equipo.getJugadores().size();i++) {
				System.out.println("Jugador: " + equipo.getJugadores().get(i).getNombre() +
						" altura: " +
						equipo.getJugadores().get(i).getAltura() + " edad: " + 
						equipo.getJugadores().get(i).getEdad());
				
			}
			
		} 
		catch (ValorInvalidoException  ex) {
			System.err.println(ex.getMessage());
		}
		

	}

}
