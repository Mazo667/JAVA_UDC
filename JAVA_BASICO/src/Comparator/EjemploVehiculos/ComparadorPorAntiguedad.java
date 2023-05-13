package Comparator.EjemploVehiculos;

import java.util.Comparator;

public class ComparadorPorAntiguedad implements Comparator<Vehiculos>{
	public int compare(Vehiculos vehiculo1, Vehiculos vehiculo2) {
		//integer.valueof es un metodo que me devuelve el valor primitivo de un objeto en este caso un entero
		return Integer.valueOf(vehiculo1.getAntiguedad()).compareTo(vehiculo2.getAntiguedad());
	}
}
