package Patron_De_Diseño_Observer;

public class Usuario implements Observador {
	  private String nombre;
	    
	    public Usuario(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public void recibirNotificacion(String noticia) {
	        System.out.println(nombre + " ha recibido una nueva noticia: " + noticia);
	    }
}
