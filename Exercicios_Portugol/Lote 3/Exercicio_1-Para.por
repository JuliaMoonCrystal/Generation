programa{
	
	funcao inicio(){
		inteiro numFilhos=0,mediaFilhos,numFilhosTotal=0
		real maiorSalario=0,salario,percentual=0,mediaSalario,salarioTotal=0,aux=0

		para(inteiro x=1; x<=20;x++){
			escreva("\nDigite o seu salário: ")
			leia(salario)

			escreva("\nDigite quantos filhos você tem: ")
			leia(numFilhos)

			salarioTotal+=salario//soma todos os salários
			numFilhosTotal+=numFilhos// soma a quantidade total dos filhos
               aux= salario

               se(aux > maiorSalario){
               	maiorSalario =aux
               }

                   
			se(salario <=100.0){
				percentual+=1
			}
		}

		mediaSalario=salarioTotal/20
		percentual=(percentual*100)/20

          escreva("\n\t\t Tabela ")
		escreva("\n\t\t|-------------------------------------------------------------------------------|")
		escreva("\n\t\t| Média do salário : ",mediaSalario," |Média do numero de filhos: ",numFilhosTotal/20)
		escreva("\n\t\t|-------------------------------------------------------------------------------|")
		escreva("\n\t\t|Percentual : ",percentual," % |Maior salário : ",maiorSalario)
          escreva("\n\t\t|-------------------------------------------------------------------------------|")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 933; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */