package Estoque;

public class estoque {
   private String codigoProduto;
   private int quantidade;
   private String nomeProduto;
   private String tipo;
 
   public estoque(String codigoProduto, int quantidade, String nomeProduto, String tipo) {
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
   
   
   
   
}
