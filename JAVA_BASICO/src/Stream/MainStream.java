package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class MainStream {

	public static void main(String[] args) {
		//Lista de enteros
		List<Integer> x = Arrays.asList(1,2,3,4,5);
		System.out.println(x);
		//Metodo reduce, permite obtener un unico valor genereado en funcion de todos los elementos de una coleccion
		int sum = x.stream().reduce((a,b)-> a+b).get();
		System.out.println("Metodo Reduce: " +sum);
		
		//Lista de cadenas
		List<String> t = Arrays.asList("m","a","x","i");
		System.out.println(t);
		String s = t.stream().reduce((a,b)->a+b).get();
		System.out.println("Metodo Reduce: " +s);
		
		//Metodo forEach itera los elementos de la coleccion y le aplica a cada uno, la operacion que le indiquemos
		System.out.println("Metodo forEach");
		x.stream().forEach((a)->System.out.println(a));
		
		//Metodo filter itera los elementos de la coleccion al posibilitar filtrarlos en funcion de un criterio
			//Filtro los numeros que sean pares y que se guarden en una lista diferente
		List<Integer> subLst = x.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(subLst);
		
		//Un ejemplo juntando los metodos filter y reduce
		int sumPares = x.stream().filter(a->a%2==0).reduce((a,b)->a+b).get();
		System.out.println(sumPares);
	}

}
