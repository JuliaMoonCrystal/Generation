package POO;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Jos�","An�lista de Sistema-Senior","Tecnol�gico", 12000);
		Funcionario funcionario2 = new Funcionario("Luis","An�lista de Sistema-Pleno","Tecnol�gico",8000);
		Funcionario funcionario3 = new Funcionario("Lima","An�lista de Sistema-Junior","Tecnol�gico", 4000);
		
		System.out.println("Nome "+" \t\t Cargo    \t\tSetor    \tSal�rio");
		funcionario.imprimir();
		funcionario2.imprimir();
		funcionario3.imprimir();
		
		System.out.println("Mudando o sal�rio do an�lista junior");
		System.out.println("------------------------------------");
		funcionario3.mudaSalario(2000.0);
		funcionario2.mudaSalario(2000.0);
		funcionario.mudaSalario(2000.0);
		
		System.out.println("Novo sal�rio");
		funcionario.imprimir();
		funcionario2.imprimir();
		funcionario3.imprimir();
		

	}

}
