package BloquesEstaticos;

public class BloqueEstatico {
	//El codigo que encerremos dentro solo se ejecutara una unica vez.
	static {
		System.out.println("--Bloque Estatico--");
	}
	
	public BloqueEstatico(String n) {
		System.out.println("Constructor: "+n);
	}
	
	
	public static void main(String[] args) {
		//Instanciamos el bloque Estatico
		new BloqueEstatico("Maxi");
		new BloqueEstatico("Juan");
		new BloqueEstatico("Pedro");
	}
}
