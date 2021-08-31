package Familia32;

import java.util.Scanner;

public class Exericio1 {

	public static void main(String[] args) {
            int anos,mes,dias,Totaldias;
            String resposta;
            
            Scanner scan= new Scanner(System.in);
            
		    System.out.println("\nDigite A quantidade de anos : ");
		    anos= scan.nextInt();
		    
		    System.out.println("\nDigite A quantidade de messes : ");
		    mes= scan.nextInt();
		    
		    System.out.println("\nDigite A quantidade de dias : ");
		    dias= scan.nextInt();
		    
		   
		    Totaldias =(anos * 365) +(mes*30)+ dias;
		  
		
		    System.out.println("\n A sua idade total em dias é :" +Totaldias);
	}

}
