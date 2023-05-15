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
    		System.out.println("El Arbol esta vacio");
    	}else {
    		this.eliminar(this.raiz, dato);
    	}
    }
    
    private void eliminar(Nodo padre,int dato) {
    	//El nodo donde estoy parado es el nodo a eliminar
    if(padre.getDato() == dato) {
    	//El nodo tiene hijos
    	if(padre.getDerecho() != null || padre.getIzquierdo() != null) {
    		//El hijo derecho es el que hay que eliminar
    		if(padre.getDerecho().getDato() == dato) {
       			Nodo aux = padre.getDerecho();
       			//El hijo tiene hijos
       			if(aux.getDerecho() !=null || aux.getIzquierdo() !=null) {
       				aux = eliminarNodoPadre(aux,dato);
       				padre.setDerecho(aux);
       			//El hijo no tiene hijos
       			}else {
       				padre.setDerecho(null);
       			}
    		//El hijo izquierdo es el que hay que eliminar
    			}else if(padre.getIzquierdo().getDato() == dato) {
    				Nodo aux = padre.getIzquierdo();
    				//El hijo tiene hijos
           			if(aux.getDerecho() !=null || aux.getIzquierdo() !=null) {
           				aux = eliminarNodoPadre(aux,dato);
           				padre.setIzquierdo(aux);
           			//El hijo no tiene hijos
           			}else {
           				padre.setIzquierdo(null);
           			}
    			}
    		//El nodo no tiene hijos y es el dato
    	}else {
        	if (padre.getDerecho() == null &&
        		padre.getIzquierdo() == null && 
        		padre.getDato() == dato) {
        		this.raiz = null;
        	}
    	}	
    //El nodo donde estoy parado no es el nodo a eliminar sigo la recursion
    }else {
    	//El nodo esta a la derecha
    	if(padre.getDato()< dato) {
    		eliminar(padre.getDerecho(),dato);
    	//El nodo esta a la izquierda
    	}else {
    		eliminar(padre.getIzquierdo(),dato);
    	}
    	
    	}
   }
    
    private Nodo eliminarNodoPadre(Nodo padre,int dato) {
    	//El hijo tiene hijo derecho y no tiene izquierdo
		if(padre.getDerecho()!= null && padre.getIzquierdo() == null) {
			return padre.getDerecho();
		//El hijo tiene hijo izquierdo y no tiene hijo derecho
		}else if(padre.getIzquierdo()!=null && padre.getDerecho() == null) {
			return padre.getIzquierdo();
		//El hijo tiene ambos hijos derecho y izquierdo
		}else{
			return padre.getIzquierdo();
		}
		
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
