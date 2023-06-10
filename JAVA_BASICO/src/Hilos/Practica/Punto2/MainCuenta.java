package Hilos.Practica.Punto2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainCuenta {

	public static void main(String[] args) {
		 Banco banco = new Banco("Frances");
		 Random rand = new Random();
	        // Creamos algunas cuentas y las agregamos al banco
	        Cuenta cuenta1 = new Cuenta(1, 1000);
	        Cuenta cuenta2 = new Cuenta(2, 2000);
	        Cuenta cuenta3 = new Cuenta(3, 3000);
	        banco.agregarCuenta(cuenta1);
	        banco.agregarCuenta(cuenta2);
	        banco.agregarCuenta(cuenta3);

	        // Creamos una lista de objetos Debito
	        List<Debito> debitos = new ArrayList<>();
	        debitos.add(new Debito(1, 500));
	        debitos.add(new Debito(2, 2500));
	        debitos.add(new Debito(3, 2500));
	        debitos.add(new Debito(4, 1000)); // Este debito no existe en ninguna cuenta

	        // Realizamos los débitos concurrentemente
	        banco.debitar(debitos);
	    }
	}