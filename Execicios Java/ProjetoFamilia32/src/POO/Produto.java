package POO;

public class Produto {
    private String nome;
    private String tipo;
    private String numSerie;
    
    public Produto(String nome, String tipo,String numSerie) {
		this.nome = nome;
		this.tipo = tipo;
		this.numSerie=numSerie;
	}
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
    
	public void imprimir() {
		System.out.println("\nProduto: "+this.nome+"\nTipo: "+this.tipo+"\nNumero de série: "+this.numSerie);
	}
    
}
