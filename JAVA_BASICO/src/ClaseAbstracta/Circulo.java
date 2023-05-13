package ClaseAbstracta;

public class Circulo extends FiguraGeometrica{
	private int radio;
	
	public Circulo(int r) {
		super("Circulo");
		radio = r;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
}
