programa{
	
	funcao inicio(){
         real pontuacao[5],maiorpontuacao=0.0

         para(inteiro x=0;x<5;x++){
              escreva("\nDigite a sua pontuação :")
              leia(pontuacao[x])

              se(pontuacao[x] > maiorpontuacao){
              	  maiorpontuacao = pontuacao[x]
              }

         	   escreva(" [ ",pontuacao[x]," ] ") //--Teste para ver a saida do vetor
         }

		escreva("\nA maior pontuação é : ",maiorpontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 4, 14, 9}-{maiorpontuacao, 4, 27, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */