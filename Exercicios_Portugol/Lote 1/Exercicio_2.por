programa{
	
	funcao inicio(){
	   inteiro dias,anos,mes,DiasIdade
	   
		escreva("\t Idade para anos\t")
		escreva("\nDigite a sua idade em dias: ")
		leia(DiasIdade)

		anos=DiasIdade/365
		mes=(DiasIdade-(anos*365))/30
		dias=DiasIdade -(anos*365)-(mes*30)

		escreva("Anos: ",anos,"\n ","Mês: ",mes, "\n","Dias: ",dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */