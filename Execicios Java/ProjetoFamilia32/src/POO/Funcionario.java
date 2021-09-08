package POO;

public class Funcionario {
   private String nome;
   private String cargo;
   private String setor;
   private double salario;
   
public Funcionario(String nome, String cargo, String setor, double salario) {
	super();
	this.nome = nome;
	this.cargo = cargo;
	this.setor = setor;
	this.salario = salario;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public String getSetor() {
	return setor;
}

public void setSetor(String setor) {
	this.setor = setor;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

 public void imprimir() {
	 System.out.println(this.nome+"\t"+this.cargo+"\t"+this.setor+"\t"+this.salario);
 }
 
 public void mudaSalario(Double percentual) {
	 salario =salario + percentual/100;

 }
   
   
}
