package POO;

public class TesteAviao {

	public static void main(String[] args) {

		Aviao[] aviao= new Aviao[3];
		
		aviao[0]=new Aviao("Cessna 150/153","Vermelho","Comercial");
		aviao[1]=new Aviao("Boeing 737","Azul","\tComercial");
		aviao[2]=new Aviao("Airbus 3000","Amarelo","\tParticular");
		
		System.out.println("Modelo \t\t\tcor \t\tTipo   ");
		for (Aviao roda : aviao) {
			roda.imprimir();
		}
		
	}

}
