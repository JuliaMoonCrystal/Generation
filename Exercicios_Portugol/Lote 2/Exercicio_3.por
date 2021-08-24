programa{
	inclua biblioteca Matematica-->mat
	funcao inicio(){
		inteiro num1,num2,num3,num4,valor1,valor2,valor3,valor4
		
		escreva("\nDigite o primeiro número : ")
		leia(num1)

		escreva("\nDigite o  segundo número : ")
		leia(num2)

          escreva("\nDigite o terceiro número : ")
		leia(num3)

          escreva("\nDigite o quarto número : ")
		leia(num4)


          valor1=mat.potencia(num1,2)
          valor2=mat.potencia(num2,2)
          valor3=mat.potencia(num3,2)
          valor4=mat.potencia(num4,2)

           se(valor3 >=1000){
           	  escreva("\nValor do Terceiro numero: ", valor3)
           }
          senao{
          	 escreva("\nValor 1: ", valor1, "\nValor 2: ",valor2,"\nValor 3: ",valor3,"\nValor 4: ",valor4)
          }
         
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 617; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */