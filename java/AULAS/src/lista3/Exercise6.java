package lista3;

import java.util.Scanner;

public class Exercise6 {

	/*
	 * E screver um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mySc = new Scanner(System.in);
		int numero=0;
		int contador=0;
		double media=0.00;
		double total=0.00;
		
		do {
			System.out.print("Digite um numero : ");
			numero = mySc.nextInt();
			if(numero>0 && (numero%3)==0){
				//Contador
				numero++;
				//Totalizador
				total += numero;
			
			}
			
		}while(numero >0);
		media = total/contador;
		System.out.printf("Total de numero %.0f, total de n�meros digitaldos multiplos de 3 %d e m�dia %.2f",total,media,contador);
	
	}

}
