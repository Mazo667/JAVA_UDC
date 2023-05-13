package ClaseAbstracta;

public class Rectangulo extends FiguraGeometrica{
	private Double base;
	private Double altura;
	
	public Rectangulo(Double b, Double h) {
		super("Rectangulo");
		base = b;
		altura = h;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
}
