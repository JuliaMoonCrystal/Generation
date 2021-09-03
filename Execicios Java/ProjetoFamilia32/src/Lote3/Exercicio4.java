package Lote3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		double matriz1[][]= new double[2][2];
		double matriz2[][]= new double[2][2];
		double matrizSoma[][]= new double[2][2];
		double matrizDif[][]= new double[2][2];
		
		Scanner scan = new Scanner(System.in);
		int opc=0;
		double num;
		
		//alimentando a matriz1
		for(int linha=0;linha <2;linha++) {
			for(int coluna =0;coluna <2;coluna++) {
				System.out.println("\nDigite um número para a matriz 1:");
				num=scan.nextDouble();
				matriz1[linha][coluna]=num;
			}
		}
		
		//alimentando a matriz 2
		for(int linha=0;linha <2;linha++) {
			for(int coluna =0;coluna <2;coluna++) {
				System.out.println("\nDigite um número para a matriz 2 :");
				num=scan.nextDouble();
				matriz2[linha][coluna]=num;
			}
		}
		
		do {
			System.out.println("\n--Telinha--"
                    +"\n1-Somar as duas matrizes"
		            +"\n2-Subtrair"
                    +"\n3-Adicionar uma constante"
		            +"\n4-imprimir as matrizes"
                    +"\n9-acabar consulta");
		    opc=scan.nextInt();	
			switch (opc) {
			case 1:
				for(int linha=0;linha <2;linha++) {
					for(int coluna =0;coluna <2;coluna++) {
						matrizSoma[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
					}
				}
				System.out.println("\nMatriz somada");
				break;
				
			case 2:
				for(int linha=0;linha <2;linha++) {
					for(int coluna =0;coluna <2;coluna++) {
						matrizDif[linha][coluna]=matriz1[linha][coluna]-matriz2[linha][coluna];
					}
				}
				System.out.println("\nMatriz Diferenciada");
				break;
				
			case 3:
				System.out.println("\nDigite um número: ");
				num= scan.nextDouble();
				for(int linha=0;linha <2;linha++) {
					for(int coluna =0;coluna <2;coluna++) {
						matriz1[linha][coluna]+=num;
						matriz2[linha][coluna]+=num;
					}
				}
				System.out.println("\nConstante adicionada!");
				break;
				
			case 4:
				System.out.println("\nMatriz 1");
				for(int linha=0;linha <2;linha++) {
					for(int coluna =0;coluna <2;coluna++) {
						System.out.print("[ "+matriz1[linha][coluna]+" ]");
					}
					System.out.println("\n");
				}
				
				System.out.println("\nMatriz 2");
				for(int linha=0;linha <2;linha++) {
					for(int coluna =0;coluna <2;coluna++) {
						System.out.print("[ "+matriz2[linha][coluna]+" ] ");
					}
					System.out.println("\n");
				}
				
				System.out.println("\nMatriz Soma");
				for(int linha=0;linha <2;linha++) {
					for(int coluna =0;coluna <2;coluna++) {
						System.out.print("[ "+matrizSoma[linha][coluna]+" ] ");
					}
					System.out.println("\n");
				}
				
				System.out.println("\nMatriz Diferença");
				for(int linha=0;linha <2;linha++) {
					for(int coluna =0;coluna <2;coluna++) {
						System.out.print(" [ "+matrizDif[linha][coluna]+" ]");
					}
					System.out.println("\n");
				}
               break;
               
			case 9:
				System.out.println("\n Fim da consulta");
				scan.close();
				break;
			}
			
		}
		while(opc !=9);
		
	}

}
