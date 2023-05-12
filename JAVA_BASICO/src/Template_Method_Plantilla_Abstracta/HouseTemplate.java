package Template_Method_Plantilla_Abstracta;

public abstract class HouseTemplate {
	//template method, final para que las subclases no puedan anularse
		public final void buildHouse(){
			buildFoundation();
			buildPillars();
			buildWalls();
			buildWindows();
			System.out.println("House is built.");
		}
		//implementación predeterminada
		private void buildWindows() {
			System.out.println("Building Glass Windows");
		}
		//métodos para ser implementados por las subclases
		public abstract void buildWalls();
		public abstract void buildPillars();

		private void buildFoundation() {
			System.out.println("Building foundation with cement,iron rods and sand");
		}
		//buildHouse() es el método de plantilla y define el orden de ejecución en varios pasos.
}
