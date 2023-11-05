import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Operacion suma = new Suma(10, 8);
		Operacion resta = new Resta(15, 6);

		System.out.println(suma.operar());  
		System.out.println(resta.operar()); 
	}
}
