package exemplos;

import java.util.Random;

public class RolesAleatorios {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		String lugar[] = {"Vaticano", "Quadra da mangueira", "Templo de salom�o", "Ilhas da maldivas", "Praia Grande"};
		
		int numero;
		// Vers�o classe random
		//numero = aleatorio.nextInt((lugar.length)-1);
		//System.out.println("Voc� est� agora: "+lugar[numero]);
		
		//Vers�o Math
		numero = (int) Math.random()*(lugar.length);
		System.out.println("Voc� est� agora: "+lugar[numero]);
	}

}
