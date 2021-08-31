package Familia32;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y;
		
         Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a=scan.nextFloat();

		System.out.println("\nDigite o valor de B: ");
		b=scan.nextFloat();
		
		System.out.println("\nDigite o valor de C: ");
		c=scan.nextFloat();
		
		System.out.println("\nDigite o valor de D: ");
		d=scan.nextFloat();
		
		System.out.println("\nDigite o valor de E: ");
		e=scan.nextFloat();
		
		System.out.println("\nDigite o valor de F: ");
		f=scan.nextFloat();
		
		x=(c*e)-(b*f)/(a*e)-(b*d);
		y=(a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println("\nValor de X : "+x+" Valor de Y : "+y);
	}

}
