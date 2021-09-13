package Estoque;

import java.io.IOException;
import java.util.ArrayList;
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
   
  
   
   
}
