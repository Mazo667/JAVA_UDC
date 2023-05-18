package Excepciones.EjemploParcial;

public class main {

	public static void main(String[] args) {
		
		Billete cinco = new Billete(5);
		Billete diez = new Billete(10);
		Billete veinte = new Billete(20);
		Billete cincuenta = new Billete(50);
		Billete cien = new Billete(100);
		Billete doscientos = new Billete(200);
		Billete quinientos = new Billete(500);
		
		try {
			
			AlcanciaTransparente alcancia = new AlcanciaTransparente();
			alcancia.insertarDinero(quinientos, 2);
			alcancia.insertarDinero(1000);
			System.out.println(alcancia.cantidadBilletes());
			System.out.println("Monto Total: "+alcancia.montoTotal()+"$");
		
		}catch (BilleteInvalidoException ex) {
			System.err.println(ex.getMessage());
		}
		
	}

}
