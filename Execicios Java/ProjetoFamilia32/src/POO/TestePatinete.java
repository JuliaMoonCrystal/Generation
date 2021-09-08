package POO;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete[] patinete = new Patinete[3];
		
		patinete[0]= new Patinete("Vermelho","Infántil",150.0);
		patinete[1]= new Patinete("Carmesim","Infántil",180.0);
		patinete[2]= new Patinete("Rosa-Sock","Infántil",110.0);
		
		
		for (Patinete roda : patinete) {
			roda.imprimir();
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("\t\tReajuste de preços");
		for (Patinete roda : patinete) {
			roda.mudaPreco(21.0);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Mudando o modelo");
		
		patinete[2].setModelo("Júvenil");
		for (Patinete roda : patinete) {
			roda.imprimir();
		}
		

	}

}
