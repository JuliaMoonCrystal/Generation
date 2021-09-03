package Lote3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
         int num,somaPares=0,contImpar=0;
         int vetor[]= new int[6];
         
         Scanner scan = new Scanner(System.in);
         
         for(int x=0; x<6;x++) {
        	 System.out.println("\n Digite um número :");
        	 num=scan.nextInt();
        	 vetor[x]=num;
        	 
        	 if(vetor[x] % 2 == 0) {
        		 System.out.println("Esse número é par [ "+vetor[x]+" ] ,");
        	     somaPares+=num;
        	 }
        	 else {
        		 System.out.println("Esse número é impar [ "+vetor[x]+" ] ,");
        	     contImpar++;
        	 }
         }
         System.out.println("\n Soma dos número pares : "+somaPares);
         System.out.println("\n Quantidade de números impares digitados : "+contImpar);
		
	}

}
