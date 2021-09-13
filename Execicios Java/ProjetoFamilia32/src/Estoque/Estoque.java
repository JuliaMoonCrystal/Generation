package Estoque;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

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

   public Estoque() {
	   super();
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
   
  public List<Estoque> Adicionar(List<Estoque> estoque) {
	  Scanner scan = new Scanner(System.in);
	  
	  String codProduto,nomeProduto,tipo;
	  int qtd;
	  System.out.println();
//		  System.out.println("\nDigite o código do produto: ");
//		  codProduto= scan.nextLine();
//		 
//		  
//		  System.out.println("\nDigite o nome do produto: ");
//		  nomeProduto= scan.nextLine();
//		  
//		  System.out.println("\nDigite o Tipo do produto :");
//		  tipo= scan.nextLine();
//		  
//		  System.out.println("\nDigite a quntidade em estoque");
//		  qtd= scan.nextInt();
//	      scan.close();
	  
	       codProduto=(JOptionPane.showInputDialog(null,"Digite O código do produto :"));
	       nomeProduto=(JOptionPane.showInputDialog(null,"Digite O nome do produto :"));
	       tipo=(JOptionPane.showInputDialog(null,"Digite O tipo do produto :"));
	       qtd=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite O código do produto :"));
		 
		   estoque.add(new Estoque(codProduto,qtd,nomeProduto,tipo));
	 
		   JOptionPane.showMessageDialog(null,"Produto adicionado na lista ");

	  return estoque;
  }
  
    public List<Estoque> Remover(List<Estoque> estoque) {
		int index=0,valor;
		Scanner scan = new Scanner(System.in);
		
		for(int x=0; x < estoque.size();x ++) {
			System.out.println("INDEX : "+index+ " - "+codigoProduto+" - "+nomeProduto+ " - "+tipo+" - "+quantidade);
			index++;
		}
		
		System.out.println("\n Qual elemento você quer remover ? ");
		valor= scan.nextInt();
		if(valor > estoque.size() || valor < 0) {
			JOptionPane.showMessageDialog(null," Valor inválido");
		}
    	estoque.remove(valor);
    	
    	return estoque;
		
	}

	public void Atualizar(List<Estoque> estoque) {
		int index=0,valor;
		Scanner scan = new Scanner(System.in);
		
		for(int x=0; x <= estoque.size();x ++) {
			System.out.println("INDEX : "+index+ " - "+codigoProduto+" - "+nomeProduto+ " - "+tipo+" - "+quantidade);
			index++;
		}
		
	}
   
   
}
