package Herança;

public class Cavalo extends Animal{
      private String nome;
      private int idade;
	
	public Cavalo(String especie, String categoria, String nome,int idade) {
		super(especie, categoria);//parametros super classe
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
		System.out.println("Emite som :Relicho");
	}
	
	public void Corre() {
		System.out.println("Cavalo está :Correndo , Correndo");
	}
	
	public void imprimir() {
		System.out.println("\nEspécie: "+getEspecie()+"\nCatégoria: "+getCategoria()+"\nNome :"+nome+"\nIdade :"+idade);
	}

}
