package Lote2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int par=0,impar=0,num;
		
		Scanner scan = new Scanner(System.in);
		
		for (int x=1; x <=10;x++) {
			System.out.println("\nDigite um número : ");
			num=scan.nextInt();			
			if(num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("\nNúmeros pares : "+par+" \nNúmeros impares : "+impar);

	}

}
