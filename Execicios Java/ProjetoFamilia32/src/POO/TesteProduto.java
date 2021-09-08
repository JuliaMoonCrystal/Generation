package POO;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto[] prod = new Produto[4];
		
		prod[0]= new Produto("Pendrive","Eletronico", "N908");
		prod[1]= new Produto("Mouse","Eletronico", "E008");
		prod[2]= new Produto("Secador de cabelo","Eletro Domestico", "h909");
		prod[3]= new Produto("Caderno","Material Escolar", "Q998");
		
		
		for (Produto roda : prod) {
			roda.imprimir();
		}
		
		System.out.println("\n--Mudando alguns produtos--");
		prod[0].setNome("TV");
		prod[0].setTipo("Eletro Domestico");
		prod[0].setNumSerie("S546");
		
		prod[3].setNome("Notebook");
		prod[3].setTipo("Recurso Tecnológico");
		prod[3].setNumSerie("O765");
		
		System.out.println("-------------------------------------");
		for (Produto roda : prod) {
			roda.imprimir();
		}

	}

}
