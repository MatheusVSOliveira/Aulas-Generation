programa
{
	
	funcao inicio()
	{
		inteiro C
		real N,E,S

		escreva("Entre com o código do funcionário: ")
		leia(C)
		escreva("Entre com o número de horas trabalhadas: ")
		leia(N)
		se(N > 50) 
		{
			E = (N - 50) * 20
			S = (50.0 * 10) + E
			escreva("\nFuncionário código: ",C,"\nHora(s) trabalhada(s): "
			,N,"\nSalário total: R$",S, "\nSalário excedente: R$", E)	
		}

		senao
		{
			E = 0.0
			S = N * 10
			escreva("\nFuncionário código: ",C,"\nHora(s) trabalhada(s): ",
			N,"\nSalário total: R$",S, "\nSalário excedente: R$", E)	
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */