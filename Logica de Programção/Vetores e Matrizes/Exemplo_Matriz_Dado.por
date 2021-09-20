programa
{
	
	funcao inicio()
	{
		inteiro dado[10],somaLancamento=0,mediaLancamento,contPontuacao=0,x

		para(x=0;x<10;x++)
		{
			escreva("\nLançamento ",x+1," ; ")
			leia(dado[x])

			somaLancamento += dado[x]
			se(dado[x] == 6)
			{
				contPontuacao++
			}
		}
		mediaLancamento = somaLancamento / 10

		escreva("\nMédia de lançamentos foi de; ", mediaLancamento)
		escreva("\nMédia da maior pontuação foi de;", contPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */