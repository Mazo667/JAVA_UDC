package Comparator.EjemploVehiculos;

import java.util.*;

public class MainComparadorVehiculos {

	public static void main(String[] args) {
		Vehiculos vehiculo1 = new Vehiculos("Ford","Ka","AE-418-2F", 4.50222,6);
		Vehiculos vehiculo2 = new Vehiculos("Chevrolet","Onix","AF-123-1G",3.795190,10);
		Vehiculos vehiculo3 = new Vehiculos("Toyota", "Etios","AC-251-5F", 2.50021,2);
		Vehiculos vehiculo4 = new Vehiculos("Honda","CRV","AD-203-5G",6.000200,8);
		List<Vehiculos> autos = Arrays.asList(vehiculo1,vehiculo2,vehiculo3,vehiculo4);
		

		Collections.sort(autos);
		System.out.println("---Sin orden---");
		for (Vehiculos v: autos) {
			System.out.println(v.getMarca() + " " + v.getModelo() + "\t Antiguedad: " + v.getAntiguedad() + "\t Patente: " + v.getPatente());
		}
		
		//Listar ordando
		System.out.println("---Ordenado por antiguedad---");
		Collections.sort(autos, new ComparadorPorAntiguedad());
		//Listar ordando
		for (Vehiculos v: autos) {
			System.out.println("Antiguedad: " + v.getAntiguedad() + " " + v.getMarca() + " " + v.getModelo() + "\t Patente: " + v.getPatente());
		}
		
		System.out.println("---Ordenado por precio---");
		Collections.sort(autos, new ComparadorPorPrecio());
		for (Vehiculos v: autos) {
			System.out.println("Precio:\t" +  v.getPrecio() + "\t" + v.getMarca() + " " + v.getModelo() + "\t Patente: " + v.getPatente());
		}
		System.out.println("---Ordenado por patente---");
		Collections.sort(autos, new ComparadorPorPatente());
		for (Vehiculos v:autos) {
			System.out.println("Patente: " + v.getPatente() + " " + v.getMarca() + " " + v.getModelo() );
		}
	}

}
