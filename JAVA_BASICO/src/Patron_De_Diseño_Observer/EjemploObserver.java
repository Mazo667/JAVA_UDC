package Patron_De_Diseño_Observer;

public class EjemploObserver {

	public static void main(String[] args) {
		// Crear el sujeto observable
        ServicioNoticias servicioNoticias = new ServicioNoticias();
        
        // Crear los observadores (usuarios)
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("María");
        
        // Suscribir los observadores al servicio de noticias
        servicioNoticias.suscribirObservador(usuario1);
        servicioNoticias.suscribirObservador(usuario2);
        
        // Publicar una nueva noticia
        servicioNoticias.publicarNoticia("¡Se ha lanzado una nueva actualización del software!");

	}

}
