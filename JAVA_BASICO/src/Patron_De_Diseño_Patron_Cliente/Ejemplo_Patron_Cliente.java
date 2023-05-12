package Patron_De_Diseño_Patron_Cliente;
import Template_Method_Plantilla_Abstracta.*;

public class Ejemplo_Patron_Cliente {

	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		//usando el metodo
		houseType.buildHouse();
		System.out.println("************");
		houseType = new GlassHouse();
		houseType.buildHouse();

	}

}
