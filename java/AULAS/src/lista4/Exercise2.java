package lista4;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		
		//M�todo random. Joga o dado de fomra aleat�ria.
		Random aleatorio = new Random();
		
		//Variaveis e vetores
		int [] lancamento = new int [10];
		int numeroDado, contador, numeroMaior=0, xNumeroMaior=0,y;
		double media=0.00, x=0.0;
		
		//Loop
		for(y=0; y<lancamento.length; y++) {
			numeroDado = aleatorio.nextInt(6)+1;
			lancamento[y] = numeroDado;
			System.out.println("\n"+ (y+1)+"� Lan�amento deu: "+ lancamento[y]);
			
			x = x + lancamento[y];
			
			if(numeroDado >= numeroMaior) {
				numeroMaior = numeroDado;
			}if(numeroMaior == lancamento[y]) {
				xNumeroMaior++;
			}else {
				xNumeroMaior = 1;
			}
			numeroMaior = lancamento[y];
		}
		
		media = x/10.0;
		System.out.println("\n\nA m�dia aritm�tica dos lan�amentos foi de: "+media);
		System.out.println("\nA quantidade que o n�mero 6 saiu foi de: "+xNumeroMaior+" vezes. ");
		
		

	}

}
