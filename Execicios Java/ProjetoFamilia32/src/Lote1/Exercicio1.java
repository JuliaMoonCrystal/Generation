package Lote1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num1,num2,num3;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero : ");
		num1= scan.nextInt();
		
		System.out.println("\nDigite um n�mero : ");
		num2=scan.nextInt();
		
		System.out.println("\nDigite um n�mero : ");
		num3=scan.nextInt();
		
		if(num1 >= num2 && num1 >=num3) {
			System.out.println("\n O n�mero : "+num1+" � o maior");
		}
		else if(num2 >=num1 && num2 >= num3) {
			System.out.println("\n O n�mero : "+num2+" � o maior");
		}
		else if(num3 >= num1 && num3 >=num2) {
			System.out.println("\n O n�mero : "+num3+" � o maior");
		}
		else {
			System.out.println("\nVoc� digitou um n�mero estranho");
		}

	}

}
