package Familia32;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int a,b,c,d,r,s;
		
		Scanner scan = new 	Scanner(System.in);
		
		System.out.println("\nDigite O valor de A: ");
		a= scan.nextInt();
		
		System.out.println("\nDigite O valor de B: ");
		b= scan.nextInt();
		
		System.out.println("\nDigite O valor de C: ");
		c= scan.nextInt();
		
		r=(int) (Math.pow(a, 2)) +(2*a*b)+(int)(Math.pow(b, 2));
		s=(int) (Math.pow(b, 2)) +(2*c*b)+(int)(Math.pow(c, 2));

		d=(r+s)/2;
		
		System.out.println("\n Resultdo de R :"+ r+ " -Resultdo de S :"+s+ " -Resultdo de D :"+d);
	}

}
