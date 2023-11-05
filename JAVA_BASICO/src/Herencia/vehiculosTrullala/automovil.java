public class Automovil extends Vehiculo{

	
	public Automovil(String pat, String mar, String mod, Double valor, int año, Persona prop) {
		super(pat, mar, mod, valor, año, prop);
	}

	@Override
	public Double calcularImpuesto() {
		int antiguedad = (2023 - super.getAñoFabricacion() );
		if( antiguedad > 30) {
			return 0.0;
		}else {
			return (1.5 - (antiguedad/30) * 0.012 * (super.getValor()/10) );
		}
	}
	
	

}
