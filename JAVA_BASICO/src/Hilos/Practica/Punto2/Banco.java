package Hilos.Practica.Punto2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Banco{
	private String nombre;
	private List <Cuenta> cuentas = new ArrayList();
	
	public Banco(String nombre) {
		this.nombre = nombre;
	}
	
	 public synchronized void agregarCuenta(Cuenta cuenta) {
	        cuentas.add(cuenta);
	    }
	
	public synchronized Cuenta getCuenta(int numeroCuenta) {
		Cuenta aux = null;
		for(Cuenta c : cuentas) {
			if(c.getNumero() == numeroCuenta) {
				aux = c;
			}
		}
		return aux;
	}
	
	public void debitar(Collection<Debito> debitos) {
		for(Debito debito : debitos) {
			int numeroDeCuenta = debito.getNumeroCuenta();
			double monto = debito.getMonto();
			
	        Thread hilo = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                Cuenta cuenta = getCuenta(numeroDeCuenta);
	                if (cuenta != null) {
	                    try {
	                        cuenta.extraer(monto);
	                    } catch (BancoException e) {
	                        System.out.println(e.getMessage());
	                    }
	                }
	            }
	        });
			 hilo.start();
		}
		
	}
}
