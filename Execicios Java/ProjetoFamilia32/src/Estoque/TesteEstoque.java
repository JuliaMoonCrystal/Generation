package Estoque;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteEstoque {

	public static void main(String[] args) throws IOException {

	 List<Estoque> estoque = new ArrayList<>();
	 Estoque est = new Estoque();
	 
	 
	 estoque= est.Adicionar(estoque);
	 //JOptionPane.showMessageDialog(null,"Produto adicionado na lista ");
	
	 
	 estoque=est.Remover(estoque);
	 JOptionPane.showMessageDialog(null,"Produto foi removido da lista  ");
	 
	 est.Atualizar(estoque);
	 
	 
	 
	 
	}

	

	

}
