package Comparator;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Persona p1= new Persona("pedro","gomez");
		Persona p2= new Persona("angel","zamora");
		Persona p3= new Persona("ana","jimenez");
		Persona p4= new Persona("ana","jimenez");
		Persona p5= new Persona("maria","alvarez");
		List<Persona> lista=Arrays.asList(p1,p2,p3,p4,p5);
		lista.sort(new ComparadorNombre());
		lista.forEach(System.out::println);

	}

}
