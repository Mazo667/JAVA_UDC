package ArbolBinarioBusqueda;

public class MainArbolBinario {

	public static void main(String[] args) {
		Arbol arbol = new Arbol();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(11);
        arbol.insertar(14);
        arbol.insertar(17);
        arbol.insertar(16);
        arbol.insertar(18);
        
       arbol.eliminar(15);
        
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(18)); // true
        System.out.println(arbol.existe(4)); // false
        System.out.println(arbol.existe(2)); // true
	}

}
