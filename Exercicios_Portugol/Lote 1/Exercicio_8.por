programa{
	 inclua biblioteca Matematica -->mat
	
	funcao inicio(){
        real custoConsumidor,custoFabrica
        real impostos =0.45
        real percentagem =0.28
	
		escreva("Digite o custo de fabrica: ")
		leia(custoFabrica)
		
		custoConsumidor= custoFabrica +(custoFabrica* impostos)+(custoFabrica *percentagem)
		escreva("\nO custo do Consumudor é: ",mat.arredondar(custoConsumidor, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */