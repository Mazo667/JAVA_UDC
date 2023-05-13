package Comparator.EjemploVehiculos;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Vehiculos>{
	public int compare(Vehiculos vehiculo1, Vehiculos vehiculo2) {
		//Primero tomo el valor del primer objeto y luego lo comparo con el siguiente
	return Double.valueOf(vehiculo1.getPrecio()).compareTo(vehiculo2.getPrecio());
		}
}
