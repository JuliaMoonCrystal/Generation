package Herança;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
//		Cavalo cavalo = new Cavalo("Equus Ferus","Mamifero","Aslan",20);
//		cavalo.imprimir();
//		cavalo.Corre();
//		cavalo.EmitirSom();
//		
//		System.out.println("\n");
//		Cachorro cachorro= new Cachorro("Canis Lupus","Mamifero","Luna",4);
//		cachorro.imprimir();
//		cachorro.Corre();
//		cachorro.EmitirSom();
//		
//		System.out.println("\n");
//		Preguica preguica= new Preguica("Choloepus didactylus","Mamifero","Gal", 9);
//		preguica.imprimir();
//		preguica.Subir();
//		preguica.EmitirSom();
//		
//		System.out.println("\n--------Mudando os nomes---------------");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		cavalo.setNome(scan.nextLine());
//		System.out.println(cavalo.getNome());
		
		Cavalo cavalo = new Cavalo("Equus Ferus","Mamifero","Aslan",20);
		Cachorro cachorro= new Cachorro("Canis Lupus","Mamifero","Luna",4);
		Preguica preguica= new Preguica("Choloepus didactylus","Mamifero","Gal", 9);
		Animal animal=null;
		
		//System.out.println("\n teste: "+animal.getCategoria());
		
		animal= cavalo;
		System.out.println("\nCavalo");
		animal.imprirmir("Grande Porte");
		
		animal= cachorro;
		System.out.println("\nCachorro");
		animal.imprirmir("Pequeno porte");
		
		animal= preguica;
		System.out.println("\nPeguiça");
		animal.imprirmir("Pequeno porte");
		
		
		
		

	}

}
