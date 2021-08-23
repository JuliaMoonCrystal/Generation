programa{
	inclua biblioteca Matematica-->mat
	
	funcao inicio(){
	  real x1,x2,y1,y2,distancia,aux
		
		escreva("Digite o valor do ponto X1: ")
		leia(x1)
		
		escreva("Digite o valor do ponto X2: ")
		leia(x2)
		
		escreva("Digite o valor do ponto Y1: ")
		leia(y1)

		escreva("Digite o valor do ponto Y2: ")
		leia(y2)

		aux=(mat.potencia((x2-x1),2)) +(mat.potencia((y2-y1), 2))
		distancia=mat.raiz(aux, 2)

		escreva("A distancia entre 2 pontos é: ",mat.arredondar(distancia,2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */