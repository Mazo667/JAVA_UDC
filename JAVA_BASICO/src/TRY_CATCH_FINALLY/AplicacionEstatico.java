package TRY_CATCH_FINALLY;

import java.util.Properties;

import Excepciones.Usuario;

import java.io.*;

public class AplicacionEstatico {
	/*Mejoramos Aplicacion leyendo el archivo de propiedades dentro de un bloque de codigo estatico. Esto hara que ele archivo
	 de propiedades se lea una unica vez evitando, de este modo, que se vuelva a leer cada vez que invocamos el metodo login
	*/
	private static Properties prop = null;
	static {
		String fn = "C:\\Users\\MAXIMILIANO\\git\\JAVA_BASICO\\JAVA_BASICO\\src\\TRY_CATCH_FINALLY\\usuarios.properties";
		try(FileInputStream fis=new FileInputStream(fn) ){
			prop = new Properties();
			prop.load(fis);
			
		}catch(Exception ex) {
			//Cualquier error "salimos por excepcion"
			ex.printStackTrace();
			throw new RuntimeException("Error: ",ex);
		}
	}
	public Usuario Login(String u,String p) {
		//Leemos el valor de la propiedad username
		String usr = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		Usuario usuario = null;
		if(usr.equals(u) && pwd.equals(p)) {
			//Instancio un usuario y seteo los datos
			usuario = new Usuario();
			usuario.setUsername(usr);
			usuario.setPassword(pwd);
			usuario.setNombre(prop.getProperty("nombre"));
			usuario.setEmail(prop.getProperty("email"));
			}
			return usuario;
	}
}
