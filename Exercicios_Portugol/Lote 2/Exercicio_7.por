programa{
	
	funcao inicio(){
		real base,altura,area

		escreva("\nDigite o valor da base : ")
		leia(base)

		escreva("\nDigite o valor da Altura : ")
		leia(altura)

		se(base >0 e altura >0){
			area=(base*altura)/2
			escreva("\nArea do triangulo :",area)
		}
		senao{
			escreva("\nImpossivel calcular a área")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */