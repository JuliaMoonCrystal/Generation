package Lote3;

public class Exercicio1 {

	public static void main(String[] args) {
       int A[]= new int[6];
       int soma=0;
       
       //atribuindo s valores do array
       A[0]=1;
       A[1]=0;
       A[2]=5;
       A[3]=-2;
       A[4]=-5;
       A[5]=7;
       
       for(int x=0;x<6;x++) {
    	   if(x == 0 || x == 1 || x == 5) {
    		   soma+=A[x];
    	   }
       }
       A[3]=100;//mudando o valor da posição 4
       System.out.println("\n Soma :"+soma);
       
       for(int x=0; x<6;x++) {
    	   System.out.println("\n [ "+A[x]+" ]");
       }
	}

}
