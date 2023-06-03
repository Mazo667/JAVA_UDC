package punto3;

import java.io.*;

public class MainJugadores {

	public static void main(String[] args) throws IOException{
		
		Equipo miequipo = new Equipo("CADU");
		miequipo.agregarJugador("Gallardo",9);
		miequipo.agregarJugador("Messi",10);
		miequipo.agregarJugador("Macherano",15);
		miequipo.agregarJugador("Lopez",19);
		miequipo.agregarJugador("Mbape",22);
		miequipo.agregarJugador("Ronaldo",4);
		miequipo.agregarJugador("Sosa",5);
		miequipo.agregarJugador("Perez",13);
		miequipo.agregarJugador("Fava",13);
		miequipo.agregarJugador("Vazquez",13);
		miequipo.agregarJugador("Romero",13);
		//miequipo.agregarJugador("Romero",13);
		File texto = new File("/home/maximiliano/Descargas/Equipo.txt");
		texto.createNewFile();
		try {
            //abrir 
    		FileOutputStream archivo = new FileOutputStream("/home/maximiliano/Descargas/Equipo.txt");
    		ObjectOutputStream salida = new ObjectOutputStream(archivo);
    		//guardar 
    			salida.writeObject(miequipo);
    			salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
