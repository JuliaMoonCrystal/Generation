package Heran�a;

public class Cachorro extends Animal{
    

    public Cachorro(String especie,String categoria,String nome,int idade) {
		super(especie, categoria,nome,idade);		
		
	}
	
	public void EmitirSom() {
		System.out.println("Emite o som :Lati");
	}
	
	public void Corre() {
		System.out.println("Correndo , Correndo");
	}
	

	public void imprimir() {
		System.out.println("\nEsp�cie: "+getEspecie()+"\nCat�goria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade());
	}

	@Override
	public void imprirmir(String tamanho) {
		System.out.println("\nEsp�cie: "+getEspecie()+"\nCat�goria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade()+"\nTamanho :"+tamanho);
		
	}
	
    
}
