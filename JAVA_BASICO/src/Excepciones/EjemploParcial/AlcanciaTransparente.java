package Excepciones.EjemploParcial;
import java.util.*;

public class AlcanciaTransparente {
	List <Billete> alcancia = new ArrayList<>();
	
	public void insertarDinero(Billete b,int cantidad) {
		//Billete bi = new Billete(valor);
		for(int i = 0;i < cantidad;i++) {
			alcancia.add(b);
		}
	}
	
	public void insertarDinero(int monto) throws BilleteInvalidoException {
		Double aux = (double) (monto / 100);
		if(monto%100 == 0) {
			Billete cien = new Billete(100);	
			for(int i = 0;i < aux;i++) {
				alcancia.add(cien);
			}
		}else {
			throw new BilleteInvalidoException("Inserto un valor Invalido");
		}
	}
	
	public int montoTotal() {
		int monto = 0;
		for(Billete bil: alcancia) {
			monto += bil.getValor();
		}
		return monto;
	}
	
	public int cantidadBilletes() {
		return alcancia.size();
	}
	
}
