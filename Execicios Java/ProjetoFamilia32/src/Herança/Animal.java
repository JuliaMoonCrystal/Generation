package Herança;

public abstract class Animal {
   private String especie;
   private String categoria;
   private String nome;
   private int idade;
   public abstract void imprirmir(String tamanho);

   
   public Animal(String especie, String categoria,String nome,int idade) {
	this.idade=idade;
	this.nome=nome;
	this.especie = especie;
	this.categoria = categoria;
   }


   public String getNome() {
	return nome;
}

   public void setNome(String nome) {
	this.nome = nome;
}


   public int getIdade() {
	return idade;
}


   public void setIdade(int idade) {
	this.idade = idade;
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
