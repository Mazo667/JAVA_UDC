package TRY_CATCH_FINALLY;

public class SintaxisBasica {

	public static void main(String[] args) {
		try {
			//Intenta ejecutar este bloque de codigo
			System.out.println("Hola, chau");
		}catch (Exception ex){
			//Ocurrio un error y quiero que lo captures
			System.err.println("Entre en el Catch debido a un error.");
		}finally{ //Opcional
			//Este bloque de código siempre se ejecutara, habiendo un error o no
			System.out.println("Esto sale siempre");
		}
	}
}
