package Lote2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
         int num,cont=0;
         double media=0;
		
        Scanner scan = new Scanner(System.in);
 		
 		do {
 			System.out.println("\n Digite um número :");
 			num=scan.nextInt();
 			if(num % 3 == 0 && num !=0) {
 				media+=num;
 	 			cont++;
 			}					
 		}
 		while(num !=0);
 		
 		System.out.println("\nMédia : "+(media/cont));
	}

}
