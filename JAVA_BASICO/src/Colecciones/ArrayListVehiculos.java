package Colecciones;
import java.util.*;
import Herencia.Vehiculo;
import Herencia.Deportivo;

public class ArrayListVehiculos {
	public static void main(String[] args) {
		// se declara e inicialización el ArrayList
		List <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		// se añaden objetos de la clase Vehiculo
		vehiculos.add(new Deportivo("AE 123 CD", "Skoda", "Fabia","Blanco",750000,600));
		vehiculos.add(new Deportivo("AF 456 ER", "Ford", "Mustang","Rojo",850000,650));
		vehiculos.add(new Deportivo("AE 112 DF", "VW", "GTI ", "Azul",980000,720));
		vehiculos.add(new Vehiculo("AD 456 FA", "SEAT", "Ibiza", "Blanco"));
		vehiculos.add(new Vehiculo("AC 231 GD", "Fiat", "Ducato","Azul"));
		// recorrido de un Arraylist for con variable de control
		System.out.println("Vehiculos");		
		for (Vehiculo v: vehiculos)
		System.out.println(v.getAtributos());
		}

}
