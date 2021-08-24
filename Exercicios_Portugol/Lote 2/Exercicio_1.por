programa{
	
	inclua biblioteca Matematica-->mat
	
	funcao inicio(){
         //exercicio 1
         real P,E =0,M =0

         escreva("\nDigite o peso do saco de tomates: ")
         leia(P)

         se(P <=50 ){
         	 escreva("\n Não houve excesso ")
         	 escreva(M," - ",E)
         }
         senao{
         	E = P -50
         	M=E*4

         	escreva("Houve excesso e João vai pagar : ",mat.arredondar(M, 2), " $ de multa")
         }
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */