package Herança;

public class Preguica extends Animal{
   
	 public Preguica(String especie,String categoria,String nome,int idade) {
			super(especie, categoria,nome,idade);		
			
		}

   public void EmitirSom() {
		System.out.println("Som da Preguiça");
	}
	
	public void Subir() {
		System.out.println("Subindo Subindo");
	}
   

	public void imprimir() {
		System.out.println("\nEspécie: "+getEspecie()+"\nCatégoria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade());
	}

	@Override
	public void imprirmir(String tamanho) {
		System.out.println("\nEspécie: "+getEspecie()+"\nCatégoria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade()+"\nTamanho :"+tamanho);
		
	}
   
}
