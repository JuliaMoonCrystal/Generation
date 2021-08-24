programa{
	
	funcao inicio(){
        real indice

        escreva("\n\t\tPoluição")
        escreva("\nDigite o indice de poluição: ")
        leia(indice)

        se(indice >=0.05 e indice <= 0.25){
        	 escreva("Indice de poluição aceitavel")
        }
        senao se(indice >= 0.26 e indice <=0.30){
        	escreva("\n Industrias do grupo 1 devem suspender as operações")
        }
        senao se(indice >=0.31 e indice <= 0.40){
        	escreva("\n Industrias do grupo 2 e 1 devem suspender as operações")
        }
        senao se(indice >=0.41 e indice <=0.50){
        	escreva("\nTodos os grupos devem suspender as operações")
        }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */