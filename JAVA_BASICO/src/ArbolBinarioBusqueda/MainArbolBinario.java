package ArbolBinarioBusqueda;

public class MainArbolBinario {

	public static void main(String[] args) {
		Arbol arbol = new Arbol();
        arbol.insertar(5);
        arbol.insertar(8);
        arbol.insertar(7);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(2);
        arbol.insertar(12);
        
        arbol.eliminar(12);
        
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(1)); // true
        System.out.println(arbol.existe(7)); // false
        System.out.println(arbol.existe(0)); // true
	}

}
