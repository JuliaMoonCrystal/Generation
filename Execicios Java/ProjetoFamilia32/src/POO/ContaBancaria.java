package POO;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private double poupanca;
    
	public ContaBancaria(String numeroConta, double saldo, double poupanca) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.poupanca = poupanca;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(double poupanca) {
		this.poupanca = poupanca;
	}
    
    
}
