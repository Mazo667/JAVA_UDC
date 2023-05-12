package Enum;

public class Main_Ejemplo_Enum {

	public static void main(String[] args) {
		Mes mes = Mes.ABRIL;
        System.out.println("El mes es: " + mes.name());
        System.out.println("El nombre abreviado del mes es: " + mes.getNombreAbreviado());
        System.out.println("El mes tiene " + mes.getDias() + " días.");
         // Recorriendo todos los meses
        for (Mes m : Mes.values()) {
            System.out.println(m.name() + " - " + m.getNombreAbreviado());
        }
	}
}
