programa{
	
	funcao inicio(){
        inteiro valor

        escreva("\nDigite um numero : ")
        leia(valor)

        se(valor % 2 == 0){
        	escreva("\nO numero ",valor," é par ")
        }
	   senao{
	   	escreva("\nO numero ",valor," não é par ")
	   }

	   se(valor >=0){
	   	escreva("\nO numero ",valor,"  é positivo ")
	   }
	   senao{
	   	escreva("\nO numero ",valor," é negativo ")
	   }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */