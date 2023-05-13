package ClaseAbstracta;

public abstract class FiguraGeometrica {
	private String nombre;
	//Metodo Abstracto
	public abstract Double area();
	//Agrego un Constructor
	public FiguraGeometrica(String nom) {
		nombre = nom;
	}
	//al metodo ToString agregamos el nombre
	public String toString() {
		return nombre +" (area = "+ area()+") ";
	}
	public String getNombre() {
		return nombre;
	}
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}
}
