package errores10;

import java.util.Stack;

public class Pila {
	Stack pila = new Stack();
	
	public void estaVacio() throws PilaVaciaException {
		if(pila.size()==0) {
			throw new PilaVaciaException("La pila esta vacia");
		}
		System.out.println("La pila no esta vacia");
	}
	
	public void sacar() throws PilaVaciaException{
		if(pila.size()==0) {
			throw new PilaVaciaException("La pila esta vacia");
		}
		pila.pop();
	}
	
	public void empujar() throws PilaVaciaException{
		if(pila.size()==0) {
			throw new PilaVaciaException("La pila esta vacia");
		}
		pila.push(pila);
	}
}
