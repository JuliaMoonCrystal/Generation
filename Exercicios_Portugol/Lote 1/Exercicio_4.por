programa{
	 inclua biblioteca Matematica -->mat
	/*
	 * Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
	 */
	funcao inicio(){
          inteiro a,b,c,d,r,s
	
		escreva("Digite o valor de A: ")
		leia(a)
		
		escreva("Digite o valor de B: ")
		leia(b)
		
		escreva("Digite o valor de C: ")
		leia(c)

		r=(mat.potencia(a,2)) +(2*a*b)+(mat.potencia(b, 2))
	     s=(mat.potencia(b, 2)) +(2*c*b)+(mat.potencia(c, 2))

		
		//r=mat.potencia((a+b), 2)
		//s=mat.potencia(b+c, 2)

		d=(r+s)/2

		escreva("\nResultado do R: ",r," - ","\nResultado de S: ",s," - ","\nResultado de D : ",d)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 621; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */