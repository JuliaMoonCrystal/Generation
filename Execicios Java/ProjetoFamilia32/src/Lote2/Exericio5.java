package Lote2;

import java.util.Scanner;

public class Exericio5 {

	public static void main(String[] args) {
		int somaNumeros=0,num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Digite um número :");
		num=scan.nextInt();
		
		do {
			System.out.println("\n Digite um número :");
			num=scan.nextInt();
			somaNumeros+=num;
		}
		while(num !=0);

		System.out.println("\n A soma dos números é : "+somaNumeros);
	}

}
