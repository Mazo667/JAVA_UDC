package Hilos.Practica.Punto3;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
	private List <Integer> numeros;
	private int indice;
	
	public int cantidad() {
		return numeros.size();
	}
	
	public Contenedor() {
		numeros = new ArrayList<>();
		for(int i = 1;i <= 500;i++) {
			numeros.add(i);
		}
		indice = 0;
	}
	
	public synchronized Integer getProximo() {
		if(indice < numeros.size()) {
			Integer resultado = numeros.get(indice);
			indice++;
			return resultado;
		}
		return null;
	}
}
