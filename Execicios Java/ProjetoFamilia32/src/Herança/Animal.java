package Herança;

public class Animal {
   private String especie;
   private String categoria;

   
   public Animal(String especie, String categoria) {
	super();
	this.especie = especie;
	this.categoria = categoria;
   }


   public String getEspecie() {
	return especie;
   }


  public void setEspecie(String especie) {
	this.especie = especie;
   }


  public String getCategoria() {
	return categoria;
   }


  public void setCategoria(String categoria) {
	this.categoria = categoria;
   }
    
  
   
   
}
