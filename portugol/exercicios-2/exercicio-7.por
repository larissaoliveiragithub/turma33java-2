//Receber valores de base e altura de um triângulo e verificar se são valores válidos
//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.

programa
{
	
	funcao inicio(){
		//Variáveis 
		real base, altura, area

		//Entrada de dados
		escreva("Digite a base: ")
		leia(base)
		escreva("Digite a altura: ")
		leia(altura)

		//Processamento e saída
		se(base<=0){
			escreva("Impossível realizar, valor da base incorreta!")
		}senao se (altura <=0){
			escreva("Impossível realizar, valor da altura incorreto!")
		}senao{
		
		area = ((base * altura)/2)
		escreva("resultado: ", area)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */