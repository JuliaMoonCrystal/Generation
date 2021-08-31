package Familia32;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		float x1,x2,y1,y2,distancia,aux;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o valor do ponto X1 :");
		x1=scan.nextFloat();
		
		System.out.println("\nDigite o valor do ponto X2 :");
		x2=scan.nextFloat();
		
		System.out.println("\nDigite o valor do ponto Y1 :");
		y1=scan.nextFloat();
		
		System.out.println("\nDigite o valor do ponto Y2 :");
		y2=scan.nextFloat();
		
		aux=(float) ((float) Math.pow((x2-x1), 2) +(Math.pow((y2-y1),2)));
		distancia=(float) Math.sqrt(aux);
		
		System.out.println("\n A distancia entre esses dois pontos é : "+distancia);
	}

}
