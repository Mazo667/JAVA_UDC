public class Avion  extends Vehiculo{

	public Avion(String pat, String mar, String mod, Double valor, int año, Persona prop) {
		super(pat, mar, mod, valor, año, prop);
	}

	@Override
	public Double calcularImpuesto() {
		int antiguedad = (2023 - super.getAñoFabricacion() );
		return (antiguedad * 0.012 * (super.getValor()/100));
	}

}
