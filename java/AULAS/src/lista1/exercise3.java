package lista1;

import java.util.Scanner;

/*PROBLEMA:
 *  Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class exercise3 {

	
	public static void main(String[] args) {
		// mySc = Fun��o leia
		Scanner mySc =  new Scanner(System.in);
		
		// Vari�veis
		long durationEvent, hours, minutes, seconds;
		
		System.out.println("Insira o tempo de dura��o do evento em segundos: ");
		durationEvent = mySc.nextLong();
		
		hours = (durationEvent/3600); 
		minutes = (durationEvent/60);

		System.out.println("\nResultado em Horas:  "+hours);
		System.out.println("\nResultado em Minutos "+minutes);
		System.out.println("\nResultado em Segundos: "+durationEvent);
		
		
		
		
		
	}
}
