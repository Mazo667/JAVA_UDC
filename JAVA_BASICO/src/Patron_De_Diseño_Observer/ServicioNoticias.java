package Patron_De_Diseño_Observer;

import java.util.ArrayList;
import java.util.List;

public class ServicioNoticias {
private List<Observador> observadores = new ArrayList<>();
    
    public void suscribirObservador(Observador observador) {
        observadores.add(observador);
    }
    
    public void desuscribirObservador(Observador observador) {
        observadores.remove(observador);
    }
    
    public void publicarNoticia(String noticia) {
        for (Observador observador : observadores) {
            observador.recibirNotificacion(noticia);
        }
    }
}
