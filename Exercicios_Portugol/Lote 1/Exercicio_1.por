programa{
	
	funcao inicio(){
	/*
	 * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
	 */
		inteiro anos,mes,dias,TotalDias
		cadeia resposta
		

		 escreva("\nDigite a quantidade de anos: ")
		 leia(anos)

		 escreva("\nDigite o número de meses: ")
		 leia(mes)

		 escreva("\nDigite a quantidade de dias: ")
		 leia(dias)

		 escreva("\nVocê nasceu em um ano bisiesto?: ")
		 leia(resposta)

		 se(resposta == "Sim" ou resposta == "sim"){
		 	TotalDias=(anos * 366) +(mes*30)+ dias
		 	escreva("\nA sua idea em dias é : ",TotalDias)
		 }
           senao{
           	TotalDias=(anos * 365) +(mes*30)+ dias
           	escreva("\nA sua idade em dias é :",TotalDias," Dias")
           }		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */