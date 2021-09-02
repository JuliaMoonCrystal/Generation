package Lote2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade, menor21=0,maior50=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Digite uma idade :");
		idade= scan.nextInt();
		
		while(idade != -99) {
			System.out.println("\n Digite uma idade :");
			idade= scan.nextInt();
			if(idade <21) {
				menor21++;
			}
			else if(idade > 50) {
				maior50++;
			}
		}
		
		System.out.println("\n Total de pessoas com menos de 21 :"+menor21);
		System.out.println("\n Total de pessoas com mais de  50 anos :"+maior50);
		
		
	}

}
