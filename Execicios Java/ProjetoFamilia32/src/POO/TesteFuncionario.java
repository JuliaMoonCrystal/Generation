package POO;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("José","Análista de Sistema-Senior","Tecnológico", 12000);
		Funcionario funcionario2 = new Funcionario("Luis","Análista de Sistema-Pleno","Tecnológico",8000);
		Funcionario funcionario3 = new Funcionario("Lima","Análista de Sistema-Junior","Tecnológico", 4000);
		
		System.out.println("Nome "+" \t\t Cargo    \t\tSetor    \tSalário");
		funcionario.imprimir();
		funcionario2.imprimir();
		funcionario3.imprimir();
		
		System.out.println("Mudando o salário do análista junior");
		System.out.println("------------------------------------");
		funcionario3.mudaSalario(2000.0);
		funcionario2.mudaSalario(2000.0);
		funcionario.mudaSalario(2000.0);
		
		System.out.println("Novo salário");
		funcionario.imprimir();
		funcionario2.imprimir();
		funcionario3.imprimir();
		

	}

}
