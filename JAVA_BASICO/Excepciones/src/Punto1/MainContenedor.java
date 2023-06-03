package Punto1;

public class MainContenedor {

	public static void main(String[] args) {
		//Creo diferentes cargamentos
		Carga autoSedan = new Carga(14000.0,12.6,"Sedan");
		Carga camioneta = new Carga(22000.0,15.2,"Camioneta");
		Carga moto = new Carga(2000.50,3.1,"Moto");
		Carga lavarropas = new Carga(80.5,1.1,"Lavarropas");
		
		try {
			//Creo un contenedor y lo seteo de 0
			Contenedor miContenedor = new Contenedor(0.0,0.0);
			
			miContenedor.cargarContenedor(camioneta);
			miContenedor.cargarContenedor(autoSedan);
			
			
		}catch(CargaInvalidaException ex) {
			System.err.println(ex.getMessage());
		}

	}

}
