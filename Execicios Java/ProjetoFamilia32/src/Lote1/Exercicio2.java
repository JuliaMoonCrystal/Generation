package Lote1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num1,num2,num3,aux;
		
        Scanner scan= new Scanner(System.in);
		
		System.out.println("\nDigite um número : ");
		num1= scan.nextInt();
		
		System.out.println("\nDigite um número : ");
		num2=scan.nextInt();
		
		System.out.println("\nDigite um número : ");
		num3=scan.nextInt();

		if(num1 > num2) {
			aux= num1;
			num1=num2;
			num2=aux;
		}
		else if (num2 > num3) {
			aux=num2;
			num2 =num3;
			num3=aux;
		}
		else if(num3 > num1) {
			aux=num3;
			num1=num3;
			num3= aux;
		}
		
		System.out.println("\n Os números em ordem crescente :"+num1+" - "+num2+" - "+num3);
	}

}
