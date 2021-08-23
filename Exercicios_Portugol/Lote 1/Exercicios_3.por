programa{
	
	funcao inicio(){
	/*
	 *  Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
	 *  em segundos e mostre-o expresso em horas, minutos e segundos. 

	 */
        inteiro horas,minutos,segundos

        escreva("Digite o tempo em segundos : ")
        leia(segundos)

        horas=(segundos/3600)
        minutos=(segundos/60)

        escreva("Horas: ",horas," - ","Minutos: ", minutos," - ","Segundos: ",segundos)
        

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */