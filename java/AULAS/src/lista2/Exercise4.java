package lista2;

import java.util.Scanner;

public class Exercise4 {
/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
 * este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
	public static void main(String[] args) {
		
		Scanner mySc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite uma n�mero: ");
		x = mySc.nextInt();
		
		if((x%2)==0){
			System.out.printf("Voc� digitou "+x);
			System.out.printf("\nRaiz quadrade � "+Math.sqrt(x));
			
		}else {
			System.out.printf("Voc� digitou "+x);
			System.out.printf("\n","Seu n�mero elevado ao quadrado "+Math.pow(x,2));
		}

	}

}
