package Comparator.EjemploVehiculos;

import java.util.Comparator;

public class ComparadorPorPatente implements Comparator<Vehiculos>{
	public int compare(Vehiculos vehiculo1, Vehiculos vehiculo2) {
		return vehiculo1.getPatente().compareTo(vehiculo2.getPatente());
	}
}
