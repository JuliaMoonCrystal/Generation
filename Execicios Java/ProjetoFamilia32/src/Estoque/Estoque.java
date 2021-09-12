package Estoque;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Estoque {
   private String codigoProduto;
   private int quantidade;
   private String nomeProduto;
   private String tipo;
 
   public Estoque(String codigoProduto, int quantidade, String nomeProduto, String tipo) {
	super();
	this.codigoProduto = codigoProduto;
	this.quantidade = quantidade;
	this.nomeProduto = nomeProduto;
	this.tipo = tipo;
}

public String getCodigoProduto() {
	return codigoProduto;
}

public void setCodigoProduto(String codigoProduto) {
	this.codigoProduto = codigoProduto;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public String getNomeProduto() {
	return nomeProduto;
}

public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}
   
  public static List<Estoque> Adicionar(List<Estoque> estoque) {
	  Scanner scan = new Scanner(System.in);
	 // System.out.println("\nQuantos produtos você quer adicionar?");
	  
	  String codProduto,nomeProduto,tipo;
	  int qtd;
	  
	  for(int x=0; x<3;x++) {
		  System.out.println("\nDigite o código do produto: ");
		  codProduto= scan.nextLine();
		  
		  System.out.println("\nDigite o nome do produto: ");
		  nomeProduto= scan.nextLine();
		  
		  System.out.println("\nDigite o Tipo do produto :");
		  tipo= scan.nextLine();
		  
		  System.out.println("\nDigite a quntidade em estoque");
		  qtd= scan.nextInt();
		  
		  estoque.add(new Estoque(codProduto,qtd,nomeProduto,tipo));
		  scan.close();
	  }
	
	return estoque;
}
   
   
}
