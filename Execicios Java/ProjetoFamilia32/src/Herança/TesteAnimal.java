package Herança;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("Equus Ferus","Mamifero","Aslan",20);
		cavalo.imprimir();
		cavalo.Corre();
		cavalo.EmitirSom();
		
		System.out.println("\n");
		Cachorro cachorro= new Cachorro("Canis Lupus","Mamifero","Luna",4);
		cachorro.imprimir();
		cachorro.Corre();
		cachorro.EmitirSom();
		
		System.out.println("\n");
		Preguica preguica= new Preguica("Choloepus didactylus","Mamifero","Gal", 9);
		preguica.imprimir();
		preguica.Subir();
		preguica.EmitirSom();
		
		System.out.println("\n--------Mudando os nomes---------------");
		
		//String nome=" ";
		Scanner scan = new Scanner(System.in);
		//nome= scan.nextLine();
		
		cavalo.setNome(scan.nextLine());
		System.out.println(cavalo.getNome());
		
		

	}

}
