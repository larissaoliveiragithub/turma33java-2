package exemplos;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// Scanner
		Scanner mySc = new Scanner(System.in);

		// Vari�veis
		int numero;

		// Entrada de dados
		System.out.println("Digite um numero inteiro:");
		numero = mySc.nextInt();

		// Processamento e sa�da
		if ((numero % 2) == 0 && (numero > 1)) {
			System.out.println("Este n�mero � Par e � numero Positivo");
		} else if (numero > 1) {
			System.out.println("Este n�mero � Impar e � numero positivo");
		} else {
			System.out.println("Este numero � negativo");
		}
	}

}
