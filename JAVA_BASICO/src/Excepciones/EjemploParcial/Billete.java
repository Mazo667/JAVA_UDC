package Excepciones.EjemploParcial;

public class Billete {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Billete(int v) throws BilleteInvalidoException {
		for(Billetes bi: Billetes.values()) {
			if(v == bi.getValor()) {
				this.valor = v;
			}
		}
		if(valor == 0) {
			throw new BilleteInvalidoException("Inserte un billete valido");
		}
		
	}
}
