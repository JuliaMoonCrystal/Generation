package Heran�a;

public class Preguica extends Animal{
   
	 public Preguica(String especie,String categoria,String nome,int idade) {
			super(especie, categoria,nome,idade);		
			
		}

   public void EmitirSom() {
		System.out.println("Som da Pregui�a");
	}
	
	public void Subir() {
		System.out.println("Subindo Subindo");
	}
   

	public void imprimir() {
		System.out.println("\nEsp�cie: "+getEspecie()+"\nCat�goria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade());
	}

	@Override
	public void imprirmir(String tamanho) {
		System.out.println("\nEsp�cie: "+getEspecie()+"\nCat�goria: "+getCategoria()+"\nNome :"+getNome()+"\nIdade :"+getIdade()+"\nTamanho :"+tamanho);
		
	}
   
}
