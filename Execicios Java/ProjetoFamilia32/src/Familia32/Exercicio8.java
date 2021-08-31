package Familia32;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double custoConsumidor,custoFabrica,imp=0.45,percent=0.28;
		
		 Scanner scan = new Scanner(System.in);
			
		System.out.println("\nDigite o valor do usto de fabrica: ");
		custoFabrica=scan.nextFloat();
		
		custoConsumidor=custoFabrica+(custoFabrica*imp)+(custoFabrica* percent);
		System.out.println("\nO custo do Consumidor foi : "+Math.round(custoConsumidor));
		
	}

}
