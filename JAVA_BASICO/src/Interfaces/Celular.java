package Interfaces;

public class Celular implements Encendible{
    private boolean encendido;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("El celular se ha encendido");
    }
@Override
    public void apagar() {
        encendido = false;
        System.out.println("El celular se ha apagado");
    }
    public void hacerLlamada(String numero) {
        if (encendido) {
            System.out.println("Llamando al número: " + numero);
        } else {
            System.out.println("El celular está apagado, no se puede hacer la llamada");
        }
    }
}
