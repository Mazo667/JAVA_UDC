package ArbolBinarioBusqueda;

public class Arbol {
	
	private Nodo raiz;

    public Arbol () {

    }

    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(Nodo n, int busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato() == busqueda) {
            return true;
        } else if (busqueda < n.getDato()) {
            return existe(n.getIzquierdo(), busqueda);
        } else {
            return existe(n.getDerecho(), busqueda);
        }

    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecho() == null) {
                padre.setDerecho(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecho(), dato);
            }
        } else {
            if (padre.getIzquierdo() == null) {
                padre.setIzquierdo(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierdo(), dato);
            }
        }
    }
    
    void eliminar(int dato) {
        if (this.raiz == null) {
            System.out.println("El Árbol está vacío");
        } else {
            this.raiz = eliminar2(this.raiz, dato);
        }
    }
    
    
    private Nodo eliminar2(Nodo nodo, int dato) {
        if (nodo == null) {
            return null;
        }
        
        if (dato < nodo.getDato()) {
            nodo.setIzquierdo(eliminar2(nodo.getIzquierdo(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDerecho(eliminar2(nodo.getDerecho(), dato));
        } else {
            // Caso 1: El nodo es una hoja (no tiene hijos)
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                return null;
            }
            // Caso 2: El nodo tiene un solo hijo (derecho o izquierdo)
            if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            }
            if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            }
            // Caso 3: El nodo tiene dos hijos
            Nodo sucesor = encontrarSucesor(nodo.getDerecho());
            nodo.setDato(sucesor.getDato());
            nodo.setDerecho(eliminar2(nodo.getDerecho(), sucesor.getDato()));
        }
        
        return nodo;
    }

    private Nodo encontrarSucesor(Nodo nodo) {
        Nodo actual = nodo;
        while (actual.getIzquierdo() != null) {
            actual = actual.getIzquierdo();
        }
        return actual;
    }
    
    
    
    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierdo());
            preorden(n.getDerecho());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierdo());
            n.imprimirDato();
            inorden(n.getDerecho());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierdo());
            postorden(n.getDerecho());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}
