package Punto1;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
	private Double volumenActual;
	private Double pesoActual;
	private final Double MAX_VOLUMEN = 60.0;
	private final Double MAX_PESO = 30000.0;
	
	List <Carga> carga = new ArrayList<>();
	
	public Contenedor(Double p,Double v) {
		this.volumenActual = v;
		this.pesoActual = p;
	}

	public void cargarContenedor(Carga a) {
		
		
		if(pesoActual+a.getPeso() <= MAX_PESO && volumenActual+a.getVolumen() <= MAX_VOLUMEN) {
			carga.add(a);
			pesoActual+=a.getPeso();
			volumenActual = volumenActual+=a.getVolumen();
			System.out.println("La carga "+a.getNombre()+" entro en el contenedor");
			System.out.println("Su peso Actual es de: "+pesoActual);
			System.out.println("Su volumen Actual es de : "+volumenActual);
		}else {
			throw new CargaInvalidaException("La carga que desea meter supera las capacidades del contenedor");
		}
	}
	/*
	for(Carga car: carga) {
		this.pesoActual = pesoActual+=car.getPeso();
		this.volumenActual = volumenActual+=car.getVolumen();
	}
	*/
}
