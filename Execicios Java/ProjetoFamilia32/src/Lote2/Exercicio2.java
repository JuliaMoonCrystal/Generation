package Lote2;

public class Exercicio2 {

	public static void main(String[] args) {
		int par=0,impar=0;
		
		for (int x=1; x <=10;x++) {
			if(x % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("\n N�meros pares : "+par+" \nN�meros impares : "+impar);

	}

}
