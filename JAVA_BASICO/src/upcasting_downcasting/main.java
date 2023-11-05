public class main {

	public static void main(String[] args) {
		//Upcasting
			//Creo una instacia de la clase hijo y luego le asigno a esa instancia a una variable de tipo padre
		Padre padre = new Hijo();
			//Obtengo la propiedad nombre del tipo padre
		padre.nombre = "Maxi";
		
		System.out.println(padre.nombre);	//Maxi
		
		padre.metodo(); //Metodo desde el hijo
		
		//Downcasting de forma implita
		//Hijo h = new Padre();   ERROR NO ES POSIBLE DE FORMA IMPLICITA
		
		//Downcasting de forma explicita
			// Se convierte el objeto padre de nuevo al tipo hijo utilizando una conversion explicita. 
			// Esto es posbile debido a que el objeto padre era de tipo Hijo en un principio.
		Hijo hijo = (Hijo)padre;
		
		
		hijo.id = 1;
		System.out.println(hijo.nombre);
		System.out.println(hijo.id);
		hijo.metodo();
		
	}

}
