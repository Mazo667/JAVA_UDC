package Enum;

public class Main_Ejemplo_Enum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.SABADO;
		
		if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
			System.out.println("Es fin de semana");
		}else {
			System.out.println("Es dia de semana");
		}
	}
}
