package Colecciones;

import java.util.*;

public class SetPaises {

	public static void main(String[] args) {
		Set<String> ALCA = new HashSet<String>();
		ALCA.add("Antigua y Barbuda");
		ALCA.add("Argentina");
		ALCA.add("Bahamas");
		ALCA.add("Brasil");
		ALCA.add("Canada");
		ALCA.add("Chile");
		ALCA.add("Ecuador");
		ALCA.add("Estados Unidos de America");
		ALCA.add("Haiti");
		ALCA.add("Honduras");
		ALCA.add("Jamaica");
		ALCA.add("Paraguay");
		ALCA.add("Peru");
		ALCA.add("Republica Dominicana");
		ALCA.add("Uruguay");
		ALCA.add("Venezuela");
		System.out.println("----Paises de ALCA----");
		for(String s : ALCA) {
			System.out.println(s);
		}
	//	System.out.println(ALCA.size() ); Cantidad de elementos 
	Set<String> Mercosur = new HashSet<String>();
		Mercosur.add("Argentina");
		Mercosur.add("Brasil");
		Mercosur.add("Paraguay");
		Mercosur.add("Uruguay");
		Mercosur.add("Venezuela");
		System.out.println("----Paises de MERCOSUR----");
		for(String s : Mercosur) {
			System.out.println(s);
		}
	Set<String> Bricks = new HashSet<String>();
		Bricks.add("Brasil");
		Bricks.add("Rusia");
		Bricks.add("India");
		Bricks.add("China");
		Bricks.add("Sudafrica");
		System.out.println("----Paises de BRICKS----");
		for(String s : Bricks) {
			System.out.println(s);
		}
		
		//Digo que en el set Mercosur me remueva todos los que pertenecen a ALCA
		Mercosur.removeAll(ALCA);
		System.out.println("----aquellos que pertenecen al MERCOSUR pero no al ALCA----");
		for(String s : Mercosur) {
			System.out.println(s);
		}	
	}	
	
}
		
