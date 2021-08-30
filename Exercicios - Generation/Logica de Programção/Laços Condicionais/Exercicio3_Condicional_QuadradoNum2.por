programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1,num2,num3,num4
		
		escreva("Entre com o primeiro número: ")
		leia(num1)
		escreva("Entre com o segundo número: ")
		leia(num2)
		escreva("Entre com o terceiro número: ")
		leia(num3)
		escreva("Entre com o quarto número: ")
		leia(num4)

		se(mat.potencia(num3,2.0) >= 1000) 
		{
			escreva("O quadrado do número ", num3, " (3º número digitado) , é ",mat.potencia(num3, 2.0))	
		}
		senao
		{
			escreva("Os quadrados dos números: ",num1,", ",num2,", ",num3,", ",num4,", ", 
			"são respectivamente: ", mat.potencia(num1, 2.0),", ",mat.potencia(num2, 2.0),
			", ",mat.potencia(num3, 2.0),", ",mat.potencia(num4, 2.0))	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */