package ClaseAbstracta;

public class Triangulo extends FiguraGeometrica{
	private Double base;
	private Double altura;
	
	public Triangulo (Double b, Double h) {
		super("Triangulo");
		base = b;
		altura = h;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}
	
}
