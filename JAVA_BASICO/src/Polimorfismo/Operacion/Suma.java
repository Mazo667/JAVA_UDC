public class Suma extends Operacion{

	public Suma(int valor1, int valor2) {
		super(valor1,valor2);
	}
	
	@Override
	public int operar() {
		return valor1+valor2;
	}
	
}
