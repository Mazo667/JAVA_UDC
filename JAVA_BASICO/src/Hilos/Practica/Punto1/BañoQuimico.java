package Hilos.Practica.Punto1;

public class BañoQuimico {
	private boolean ocupado;

    public synchronized void usarBaño(String nombre ) {
        while (ocupado == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ocupado = true;

        System.out.println("La persona " + nombre + " está usando el baño.");

        // Simulamos que la persona está usando el baño
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("La persona " + nombre + " ha salido del baño.");

        ocupado = false;
        notifyAll();
    }
}
