package lista3;

import java.util.Scanner;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mySc = new Scanner(System.in);
		
		int n,x,countPar=0,countImpar = 0;
		
		for (x=0; x<10; x++) {
			
			System.out.printf("Entre com algum valor n�merico: ");
			n = mySc.nextInt();
			
			if((n%2)==0) {
				countPar = countPar + 1;
			}else if((n%2)==1) {
				countImpar = countPar + 1;
			}else {
				System.out.println("Voc� deve digitar um n�mero!\n");
			}
			

			
		}
		System.out.println("\n");
		System.out.print("Quantidade de n�meros Pares � "+countPar);
		System.out.print("\nQuantidade de n�meros Impares � "+countImpar);
	}

}
