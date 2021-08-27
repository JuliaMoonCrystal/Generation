programa{
	
	funcao inicio(){
		real matriz[3][3],somaValores=0.0,somaDiagonalP=0.0

		para(inteiro linha=0;linha < 3; linha++){
			para(inteiro coluna=0;coluna < 3; coluna++){
			     escreva("\n Digite um número: ")
			     leia(matriz[linha][coluna])

			     se(linha == coluna){
			     	somaDiagonalP+=matriz[linha][coluna]
			     }

			     somaValores+=matriz[linha][coluna]
		   }
		}

		escreva("\nSoma dos valores da Matriz: ", somaValores)
		escreva("\nSoma da diagonal Principal da Matriz: ", somaDiagonalP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 4, 7, 6}-{somaValores, 4, 20, 11}-{somaDiagonalP, 4, 36, 13};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */