package Lote2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
        int cont=1,idade,maior40=0,menor18=0,genero,temp,numCalmas=0,numNervosas=0,numAgressivos=0,numCalmo=0;
        
        Scanner scan = new Scanner(System.in);
		
		while(cont <=3) {
			
			System.out.println("\nDigite a sua idade :");
	        idade= scan.nextInt();
	        
	        System.out.println("\nEscolha o seu sexo: ");
	        System.out.println("\n1-Feminino \n2-Masculino \n3-Outros");
	        genero=scan.nextInt();
	        
			System.out.println("\nVocê é uma pessoa :");
			System.out.println("\n1- Calma  \n2- Nervosa  \n3- Agressiva");
			temp=scan.nextInt();
			
			if(temp == 1) {
				numCalmas++;
			}
			if(genero == 1 && temp == 2) {
				numNervosas++;
			}
			else if(genero == 2 && temp == 3) {
				numAgressivos++;
			}
			else if(genero == 3 && temp == 1) {
				numCalmo++;
			}
			
			if(idade >40 && temp == 2 ) {
				maior40++;
			}
			else if(idade < 18 && temp == 1) {
				menor18++;
			}
			
			cont++;
		}
		
		System.out.println("\n Número de pessoas calmas: "+numCalmas);
		System.out.println("\n Número de mulheres nervosas: "+numNervosas);
		System.out.println("\n Número de homens agressivos: "+numAgressivos);
		System.out.println("\n Número de outros calmos: "+numCalmo);
		System.out.println("\n Número de pessoas nervosas com mais de 40 anos: "+maior40);
		System.out.println("\n Número de pessoas calmas com menos de 18 anos.: "+menor18);
	}

}
