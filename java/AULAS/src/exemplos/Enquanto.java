package exemplos;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {

		Scanner mySc = new Scanner(System.in);

		// Vari�veis base
		double valoresN = 0.0;
		double soma = 0.0;
		double media = 0.00;
		double total = 0.0;

		while (valoresN >= 0) {

			System.out.printf("Digite um valor posito: ");
			valoresN = mySc.nextDouble();

			if (valoresN >= 0) {
				// Somat�ria
				soma = soma + valoresN;
				// Contador
				total++;
			}

		}
		media = soma / total;
		System.out.printf("Numero negativo! Fim do programa..\n total � %.2f \n A m�dia � %.2f\n e o n�mero de entradas foi %.2f ",
				soma, media, total);


	}

}
