package Excepciones;

import java.util.Properties;
import java.io.*;

public class AplicacionDeclarativa {
	public Usuario Login(String u,String p) throws ErrorFisicoException{
		
		FileInputStream fis = null;
		try {
		//Leemos el archivo
			Properties prop = new Properties();
			String filename =  "C:\\Users\\MAXIMILIANO\\git\\JAVA_BASICO\\JAVA_BASICO\\src\\Excepciones\\usuario.properties";
			fis = new FileInputStream(filename);
			prop.load(fis);
		//	System.out.println(prop.getProperty("usename"));
			
		//Leemos el valor username y password
		String usr = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		Usuario usuario = null;
		
		//Si coinciden username y password
		if(usr.equals(u) && pwd.equals(p)) {
			//Instanciamos un usuario y seteo los datos
			usuario = new Usuario();
			usuario.setUsername(usr);
			usuario.setPassword(pwd);
			usuario.setNombre(prop.getProperty("nombre"));
			usuario.setEmail(prop.getProperty("email"));
		}
		//Cerramos el archivo
		fis.close();
		return usuario;
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
