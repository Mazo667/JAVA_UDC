package errores10;

public class Main {

	public static void main(String[] args) {
		Pila mipila = new Pila();
		//Agrego numeros a la pila
		for (int x=1;x<=10;x++) {
			  mipila.pila.add(x);
		}
			  
		try {
			mipila.estaVacio();
			mipila.sacar();
			mipila.empujar();
			System.out.println(mipila.pila.lastElement());
		}
		catch (PilaVaciaException ex){
			System.err.println(ex.getMessage());
		}

	}

}
