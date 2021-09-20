programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1,num2,num3,num4
		real Q1,Q2,Q3,Q4
		
		escreva("Entre com o primeiro número: ")
		leia(num1)
		escreva("Entre com o segundo número: ")
		leia(num2)
		escreva("Entre com o terceiro número: ")
		leia(num3)
		escreva("Entre com o quarto número: ")
		leia(num4)

		Q1 = num1 * num1
		Q2 = num2 * num2
		Q3 = num3 * num3
		Q4 = num4 * num4

		se(Q3 >= 1000) 
		{
			escreva("O quadrado do número ", num3, " (3º número digitado) , é ",mat.arredondar(Q3, 2))	
		}
		senao
		{
			escreva("Os quadrados dos números: ",num1,", ",num2,", ",num3,", ",num4,", ", "são respectivamente: ", mat.arredondar(Q1, 2),", ",
			mat.arredondar(Q2, 2),", ",mat.arredondar(Q3, 2),", ",mat.arredondar(Q4, 2))	
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */