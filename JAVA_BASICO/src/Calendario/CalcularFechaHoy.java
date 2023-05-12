package Calendario;

import java.util.Calendar;

public class CalcularFechaHoy {

	public static void main(String[] args) {
		int diaHoy, mesHoy, añoHoy;
		diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mesHoy = Calendar.getInstance().get(Calendar.MONTH) + 1;
		añoHoy = Calendar.getInstance().get(Calendar.YEAR); 
		System.out.println("La fecha de hoy es " +
		diaHoy + "/" +
		mesHoy + "/" +
		añoHoy);
		}   //Se utiliza el método getInstance() para obtener el dia, mes y año de la fecha actual

}
