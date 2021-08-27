programa{
	
	funcao inicio(){
            real lancamento[10],media=0.0
            inteiro contMaiorPontacao=0

            para(inteiro x=0;x <10;x++){
            	escreva("\nDigite a pontuação : ")
            	leia(lancamento[x])

            	media+=lancamento[x]

            	se(lancamento[x] == 6){
            		
            		contMaiorPontacao++
            	}
            }

            escreva("\n Média aritimética dos lançamentos: ",media/10)
            escreva("\n Ocorrencias de maior pontuação: ",contMaiorPontacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lancamento, 4, 17, 10}-{media, 4, 32, 5}-{contMaiorPontacao, 5, 20, 17};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */