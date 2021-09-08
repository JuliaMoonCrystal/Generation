package POO;

import java.lang.reflect.Constructor;

public class Aviao {

	private String modelo;
	private String cor;
	private String tipo;
	
	
	public Aviao(String modelo, String cor, String tipo) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = tipo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public void imprimir() {
		//System.out.println("Modelo \t\t\tcor \t\tTipo   ");
		System.out.println(modelo+"\t\t"+cor+"\t"+tipo);
	}
}
