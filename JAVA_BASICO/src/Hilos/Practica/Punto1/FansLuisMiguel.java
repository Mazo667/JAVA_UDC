package Hilos.Practica.Punto1;

public class FansLuisMiguel extends Thread {
	private String nombre;
	private BañoQuimico baño;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public FansLuisMiguel(String nombre, BañoQuimico baño) {
        this.nombre = nombre;
        this.baño = baño;
    }

    public void run() {
        baño.usarBaño(nombre);
    }
    

}
