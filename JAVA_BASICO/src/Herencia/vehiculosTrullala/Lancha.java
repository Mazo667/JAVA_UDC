public class Lancha extends Vehiculo {

	public Lancha(String pat, String mar, String mod, Double valor, int año, Persona prop) {
		super(pat, mar, mod, valor, año, prop);
	}

	@Override
	public Double calcularImpuesto() {
		return (0.012*super.getValor());
	}

}
