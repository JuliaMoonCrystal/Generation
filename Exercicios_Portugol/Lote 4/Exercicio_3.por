programa{
	
	funcao inicio(){
		real N1[4][6],N2[4][6],M1[4][6],M2[4][6]

//N1
		para(inteiro linha=0;linha <4;linha++){
			para(inteiro coluna=0;coluna <6;coluna++){
				escreva("\n Digite um número para a Matriz N1 : ")
				leia(N1[linha][coluna])
			}
		}

//N2
		para(inteiro linha=0;linha <4;linha++){
			para(inteiro coluna=0;coluna <6;coluna++){
				escreva("\n Digite um número para a Matriz N2 : ")
				leia(N2[linha][coluna])
			}
		}

//A e B 
          para(inteiro linha=0;linha <4;linha++){
			para(inteiro coluna=0;coluna <6;coluna++){
                    M1[linha][coluna] =N1[linha][coluna] + N2[linha][coluna]//soma dos valores 

                     M2[linha][coluna] =N1[linha][coluna] - N2[linha][coluna]//subtração dos valores
				
			}
		}

           escreva(" Matriz M1 \n")
           para(inteiro linha=0;linha <4;linha++){
			para(inteiro coluna=0;coluna <6;coluna++){
				
                    escreva(" [ ",M1[linha][coluna], " ] ")	//mostra m1
			}
			escreva("\n")
		}

          escreva("\n Matriz M2 \n")
		para(inteiro linha=0;linha <4;linha++){
			para(inteiro coluna=0;coluna <6;coluna++){
                    escreva(" [ ",M2[linha][coluna], " ] ,")	//mostra m2
			}
		   escreva("\n")
		   
		}		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1027; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */