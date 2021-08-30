programa
{
	
	funcao inicio()
	{
		real a,b,c

		escreva("Digite os valores para os lados e um triângulo")
		escreva("\nEntre com o valor para o lado A: ")
		leia(a)
		escreva("Entre com o valor para o lado B: ")
		leia(b)
		escreva("Entre com o valor para o lado C: ")
		leia(c)

		se (a > 0 e b > 0 e c > 0) 
		{
			se(a < b + c e b < a + c e c < a + b) 
			{
				escreva("Os valores digitados são positivos e podem formar um triângulo segundo a regra de condição de existência")
			}
			senao 
			{
				escreva("Os valores digitados são positivos, mas não podem formar um triângulo segundo a regra de condição de existência")
			}
		}
		senao 
		{
			escreva("Os valores digitados são inválidos.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */