package Familia32;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float nota1,nota2,nota3,media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite a nota 1: ");
		nota1=scan.nextFloat();
		
		System.out.println("\nDigite a nota 2: ");
		nota2=scan.nextFloat();
		
		System.out.println("\nDigite a nota 3: ");
		nota3=scan.nextFloat();
		
		media=(float) ((nota1*0.2)+(nota2*0.3)+(nota3*0.5));
		
		System.out.println("\nA média ponderada é : "+media);

	}

}
