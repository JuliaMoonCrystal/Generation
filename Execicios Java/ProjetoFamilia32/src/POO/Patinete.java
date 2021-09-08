package POO;

public class Patinete {
    private String cor;
    private String modelo;
    private double preco;
    
	public Patinete(String cor, String modelo, double preco) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
    
	public void imprimir() {
		System.out.println(this.cor+" \t\t"+this.modelo+" \t"+this.preco);
	}
	
	public void mudaPreco(double novoPreco) {
		preco=preco+novoPreco;
	}
    
}
