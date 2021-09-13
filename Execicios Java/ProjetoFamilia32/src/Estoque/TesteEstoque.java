package Estoque;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteEstoque {

	public static void main(String[] args) throws IOException {

	 ArrayList<Estoque> estoque = new ArrayList<>();
	 int opc=0,qtd;
	 String nomeProduto,tipo,codProduto;
	 Scanner scan = new Scanner(System.in);
	 
	 do {
		
		 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"\n\t\t\t Menu de Op��es "+
		                                    "\n\t\t1-Adicionar itens no estoque\"+\r\n"
		 		+ "		                     \n\t\t2-Remover itens da Lista\"+\r\n"
		 		+ "				             \n\t\t3-Atualizar itens da Lista\"+\r\n"
		 		+ "		                     \n\t\t4-Imprimir itens da lista\"+\r\n"
		 		+ "				             \n\t\t5-Finalizar Programa"
		 		+ "                          \n\nDigite uma op��o :"));
	 switch (opc) {
	    case 1:
	    	 System.out.println();
	    	nomeProduto= JOptionPane.showInputDialog(null,"Digite o nome do Produto :");
	    	tipo=JOptionPane.showInputDialog(null,"Digite o nome do tipo do Produto :");
	    	codProduto=JOptionPane.showInputDialog(null,"Digite o c�digo do Produto :");
	    	qtd=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade  :"));
	        estoque.add(new Estoque(codProduto,qtd,nomeProduto,tipo));
	        JOptionPane.showMessageDialog(null, "Produto adicionado no estoque com sucesso!!");
	        break;
	        
	    case 2:
	    	System.out.println();
	    	int index=0;
	    	int aux;
	    	
            if(estoque.isEmpty()) {
            	JOptionPane.showMessageDialog(null, "Impossivel remover, Lista vazia");
            }
	    	
	    	System.out.println("\n\tITENS do estoque ");
	    	for (Estoque roda : estoque) {
				System.out.println("\nIndex :"+index+"\nC�digo do produto : "+roda.getCodigoProduto()+"\nNome : "+roda.getNomeProduto()
                                                           +"\nTipo :"+roda.getTipo()+"\nQuantidade :"+roda.getQuantidade());
				index++;
			}
	    	aux=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite qual iten voc� quer remover :"));
	    	estoque.remove(aux);
	    	JOptionPane.showMessageDialog(null, "Produto removido no estoque com sucesso!!");
	    	break;
	    	
	    case 3:
	    	System.out.println();
	    	int index1=0;
	    	int aux1;
	    	
            if(estoque.isEmpty()) {
            	JOptionPane.showMessageDialog(null, "Impossivel Atualizar, Lista vazia");
            }
            System.out.println("\n\tITENS do estoque ");
	    	for (Estoque roda : estoque) {
				System.out.println("\nIndex :"+index1+"\nC�digo do produto : "+roda.getCodigoProduto()+"\nNome : "+roda.getNomeProduto()
                                                           +"\nTipo :"+roda.getTipo()+"\nQuantidade :"+roda.getQuantidade());
				index1++;
	    	}
				aux1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite qual item voc� quer atualizar :"));
				
				nomeProduto= JOptionPane.showInputDialog(null,"Digite o nome do Produto :");
		    	tipo=JOptionPane.showInputDialog(null,"Digite o nome do tipo do Produto :");
		    	codProduto=JOptionPane.showInputDialog(null,"Digite o c�digo do Produto :");
		    	qtd=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade  :"));
		        estoque.add(new Estoque(codProduto,qtd,nomeProduto,tipo));
		        
		        estoque.get(aux1);
				break;
				
	    case 4:
	    	System.out.println();
	    	for (Estoque roda : estoque) {
	    		System.out.println("\nC�digo do produto : "+roda.getCodigoProduto()+"\nNome : "+roda.getNomeProduto()
                +"\nTipo :"+roda.getTipo()+"\nQuantidade :"+roda.getQuantidade());
			}
	    	break;
	    	
	    case 5:
	    	JOptionPane.showMessageDialog(null, "Programa finalizado");
	    	break;
	    	
	    default:
	    	JOptionPane.showMessageDialog(null, "Op��o inv�lida");
	    	break;
	   }
	 }while(opc != 5);
	 
	}

	

	

}
