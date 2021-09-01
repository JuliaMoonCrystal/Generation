package Lote1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int num;
		
		Scanner scan= new Scanner(System.in);
			
		System.out.println("\nDigite um número: ");
		num= scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("\n O número : "+num+" é par e a raiz dele é : "+Math.sqrt(num));
		}
		else {
			System.out.println("\n O número : "+num+" é impar e ele elevado ao quadrado é : "+Math.pow(num, 2));
		}

	}

}
