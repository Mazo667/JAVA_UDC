package Excepciones;

public class TestLogin {

	public static void main(String[] args) {
		
		try {
		//AplicacionDeclarativa app2 = new AplicacionDeclarativa();
			Aplicacion app = new Aplicacion();
			//intentamos el login
			Usuario u = app.Login("maxi", "admin");
			//Usuario u2 = app2.Login("maxi", "clave");
			System.out.println("Usuario: "+u.getUsername()+"\nEmail: "+u.getEmail()+"\nNombre: "+u.getNombre());
		}catch (Exception ex){
			//Ocurrio un error
			System.out.println("Ocurrio un error: ");
			System.out.println("Intente mas tarde");
			System.out.println(ex.getMessage());
		}
	}
}
