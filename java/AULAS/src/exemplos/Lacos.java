package exemplos;

public class Lacos {

	public static void main(String[] args) {

	////Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
	////m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.

	    //Vari�veis base
	     int cont = 0;
	     int i;

	 
	        for (i=0; i<=500; ++i){
	            if((i%2)==1 && (i%3)==0){
	                cont = cont + 1;
	                System.out.println(i);
	            }
	        }
	        System.out.printf("A soma de todos os numeros impares: ",cont);
	    }
	

}


