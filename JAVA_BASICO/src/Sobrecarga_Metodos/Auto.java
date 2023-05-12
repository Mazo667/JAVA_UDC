package Sobrecarga_Metodos;

public class Auto {
	//Atributos
	   String marca;
	   int anio;
	   //Método Constructor
	   public Auto(String marca){
	       this.marca = marca;
	   }
	   // Método Constructor Sobrecargado
	   public Auto(String marca, int anio){
	       this.marca = marca;
	       this.anio = anio;
	   }
	   // Método modelo
	   public void modelo(){
	       System.out.println("La marca es  "+ marca +", y no tiene modelo");
	   }
	   // Método modelo sobrecargado
	   public void modelo(String modelo){
	   System.out.println("La marca es  " + marca + ", y el modelo es de  "+ modelo);
	   }

}
