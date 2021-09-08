package POO;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("João Oliveira", 32);
		cliente1.imprimir();
		
		System.out.println("Mudando a idade do cliente");
		cliente1.setIdade(56);
		cliente1.imprimir();
		
		System.out.println("\nAdicionando outro cliente");
		Cliente cliente2= new Cliente("Julia F.",22);
		cliente2.imprimir();
		
	}

}
