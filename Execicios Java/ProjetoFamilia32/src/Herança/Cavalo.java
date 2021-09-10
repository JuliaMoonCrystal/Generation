package Herança;

public class Cavalo extends Animal{
    
	
	 public Cavalo(String especie, String categoria,String nome,int idade) {
			super(especie, categoria,nome,idade);		
			
		}

	public void EmitirSom() {
		System.out.println("Emite som :Relicho");
	}
	
	public void Corre() {
		System.out.println("Cavalo está :Correndo , Correndo");
	}
	
//	public void imprimir(String tamanho) {
//		System.out.println("\nEspécie: "+getEspecie()+"\nCatégoria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade()+"\nTamanho :"+tamanho);
//	}

	@Override
	public void imprirmir(String tamanho) {
		System.out.println("\nEspécie: "+getEspecie()+"\nCatégoria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade()+"\nTamanho :"+tamanho);
	
		
	}

}
