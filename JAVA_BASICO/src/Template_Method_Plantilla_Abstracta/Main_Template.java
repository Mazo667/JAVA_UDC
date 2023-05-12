package Template_Method_Plantilla_Abstracta;

public class Main_Template {

	public static void main(String[] args) {
		WoodenHouse casa1 = new WoodenHouse();
		GlassHouse casa2 = new GlassHouse();
		
		casa1.buildHouse();
		System.out.println();
		casa2.buildHouse();
	}

}
