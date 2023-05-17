package Excepciones;

public class TestLogin {

	public static void main(String[] args) {
		
		try {
			Aplicacion app = new Aplicacion();
			//intentamos el login
			Usuario u = app.Login("maxi", "admin");
			System.out.println("Haz logueado correctamente");
			System.out.println("Usuario: "+u.getUsername()+"\nEmail: "+u.getEmail()+"\nNombre: "+u.getNombre());
		}catch (Exception ex){
			//Ocurrio un error
			System.out.println("Fuera de servicio");
			System.out.println("Intente mas tarde");
			System.out.println(ex.getMessage());
		}
	}
}
