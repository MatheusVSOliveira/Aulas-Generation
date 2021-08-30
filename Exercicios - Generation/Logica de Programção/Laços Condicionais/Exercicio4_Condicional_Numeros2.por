programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("\nEntre com um número inteiro: ")
		leia(numero)
		
		se(numero % 2 == 0) {
			se (numero ==0) {
				escreva("O número digitado é 0")
			} senao se (numero > 0) {
				escreva("O número é par e positivo")
			} senao {
				escreva("O número é par e negativo")
			}
		} senao {
			se (numero < 0) {
				escreva("O número é negativo e ímpar")
			} senao {
				escreva("O número é positivo e ímpar")
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */