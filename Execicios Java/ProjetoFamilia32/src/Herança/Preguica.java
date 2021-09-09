package Herança;

public class Preguica extends Animal{
   
   private String nome;
   private  int idade;
   
   public Preguica(String especie, String categoria,String nome,int idade) {
		super(especie, categoria);
		this.idade=idade;
		this.nome=nome;
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
   
   public void EmitirSom() {
		System.out.println("Som qualquer");
	}
	
	public void Subir() {
		System.out.println("Subindo Subindo");
	}
   

	public void imprimir() {
		System.out.println("\nEspécie: "+getEspecie()+"\nCatégoria: "+getCategoria()+"\nNome :"+nome+"\nIdade :"+idade);
	}
   
}
