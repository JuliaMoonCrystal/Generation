programa{
	
	funcao inicio(){
        inteiro C,N,E=0,salario

        		escreva("\nDigite o código do operário :")
        		leia(C)

        		escreva("\nDigite o número de horas de trabalho do operário :")
        		leia(N)

                salario=N*10
                
               se(N <=50){
               	escreva("\nAqui o salario do operario : ",salario, " -  salario excedente : ",E, " - código : ",C )
               	
               }
               senao{
                    E=(N-50) *20	
                    escreva("\nAqui o salario do operario : ",salario, " -  salario excedente : ",E, " - código : ",C)
               }
        		

        		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */