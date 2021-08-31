package Familia32;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int horas,minutos,segundos;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("\nDigite os segundo : ");
        segundos= scan.nextInt();
		
		horas=(segundos/3600);
        minutos=(segundos/60) -(horas*60);
        segundos=segundos-(horas*3600)-(minutos*60);
    
        System.out.println("\n Horas : "+horas+" - minutos : "+minutos+ " - segundos :"+segundos);
        
	}

}
