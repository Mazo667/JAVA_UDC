package Colecciones;

import java.util.*;

public class SetNumeros {

	public static void main(String[] args) {
		// Creamos un conjunto de números enteros
        Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        // Obtenemos un iterador para recorrer los elementos del conjunto
        Iterator<Integer> iterador = numeros.iterator();
        // Iteramos sobre los elementos del conjunto usando el iterador
        while (iterador.hasNext()) {
            Integer numero = iterador.next();
            System.out.println(numero);
        }

	}

}
