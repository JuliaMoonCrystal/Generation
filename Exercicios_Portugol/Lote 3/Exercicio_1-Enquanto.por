programa{

	
	funcao inicio(){
          inteiro cont=0,num,soma=0
          real media

          escreva("\nDigite um número positivo : ")
          leia(num)

          enquanto(num >=0){
           soma +=num
           cont++

          escreva("\nDigite um número positivo : ")
          leia(num)
          }

          media=soma/cont
          
          escreva("\n\t\t-------------------------------------------------------")
          escreva("\n\t\tMédia : ",media, " | Contador : ",cont," | Soma : ",soma)
          escreva("\n\t\t-------------------------------------------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */