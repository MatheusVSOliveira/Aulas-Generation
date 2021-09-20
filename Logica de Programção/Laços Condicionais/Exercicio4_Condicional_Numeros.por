programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("\nEntre com um número inteiro: ")
		leia(numero)
		
		se(numero < 0) 
		{
			escreva("O número ",numero, " é negativo")
			se(numero%2 == 0) 
			{
				escreva(" e é par")	
			}
			senao 
			{
				escreva(" e é impar")	
			}
		}
		senao se (numero > 0)
		{
			escreva("O número ",numero, " é positivo")
			se(numero%2 == 0) 
			{
				escreva(" e par")	
			}
			senao
			{
				escreva(" e ímpar")	
			}	
		}
		senao 
		{
			escreva("O número ",numero, " não é nem positivo, nem negativo, mas é par")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 559; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */