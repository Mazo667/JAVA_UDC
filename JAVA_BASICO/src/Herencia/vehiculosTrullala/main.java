public class Main {

	public static void main(String[] args) {
		Persona expresoMoressi = new Persona("Expreso Moressi","Echevarria 432");
		Persona transportesRuben = new Persona("Transportes Ruben","Yapeyu 678");
		Persona aerolineasPluma = new Persona("Aerolineas Pluma","Belgrano 12");
		Persona juanPerez = new Persona("Juan Perez","Rondeau 432");
		
		Camion camion1 = new Camion("FRE 123","Fiat","1500",150000.0,1990, expresoMoressi);
		Camion camion2 = new Camion("GUL 812","Volvo","324",234000.0,2007, transportesRuben);
		Avion avion1 = new Avion("DFXCVBERT","Boeing","727",12000000.0,1993, aerolineasPluma);
		Automovil auto1 = new Automovil("JMW 234","Volkswagen","Passat",120000.0,2010, aerolineasPluma);
		Automovil auto2 = new Automovil("FFD 321","Volkswagen","Gol",28000.0,2005, juanPerez);
		Lancha lancha1 = new Lancha("FHUTYR","Cuto","345",15000.0,2000, juanPerez);
		
		imprimiVehiculo(camion1);
		System.out.println("Impuesto a pagar: "+camion1.calcularImpuesto());
		imprimiVehiculo(camion2);
		System.out.println("Impuesto a pagar: "+camion2.calcularImpuesto());
		imprimiVehiculo(avion1);
		System.out.println("Impuesto a pagar: "+avion1.calcularImpuesto());
		imprimiVehiculo(auto1);
		System.out.println("Impuesto a pagar: "+auto1.calcularImpuesto());
		imprimiVehiculo(auto2);
		System.out.println("Impuesto a pagar: "+auto2.calcularImpuesto());
		imprimiVehiculo(lancha1);
		System.out.println("Impuesto a pagar: "+lancha1.calcularImpuesto());
	}
	
	private static void imprimiVehiculo(Vehiculo vehiculo) {
		System.out.println("Camion: "+vehiculo.getMarca()+" "+vehiculo.getModelo()+", Dominio: "+vehiculo.getPatente()+" Propietario: "+
				vehiculo.getPropietario().getNombre()+", Domicilio: "+vehiculo.getPropietario().getDomicilio());

		
	}
}
