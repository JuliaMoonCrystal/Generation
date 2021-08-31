package Familia32;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int dias,anos,mes,DiasIdade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite a sua idade em dias :");
		DiasIdade= scan.nextInt();
		
		anos= DiasIdade/365;
		mes=(DiasIdade -(anos*365))/30;
		dias=DiasIdade -(anos*365)-(mes*30);
		
		System.out.println("\nSua idade: "+anos+ " anos - messes : "+mes+" dias : "+dias);

	}

}
