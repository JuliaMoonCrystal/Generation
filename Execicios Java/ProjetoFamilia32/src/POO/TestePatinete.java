package POO;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete[] patinete = new Patinete[3];
		
		patinete[0]= new Patinete("Vermelho","Inf�ntil",150.0);
		patinete[1]= new Patinete("Carmesim","Inf�ntil",180.0);
		patinete[2]= new Patinete("Rosa-Sock","Inf�ntil",110.0);
		
		
		for (Patinete roda : patinete) {
			roda.imprimir();
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("\t\tReajuste de pre�os");
		for (Patinete roda : patinete) {
			roda.mudaPreco(21.0);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Mudando o modelo");
		
		patinete[2].setModelo("J�venil");
		for (Patinete roda : patinete) {
			roda.imprimir();
		}
		

	}

}
