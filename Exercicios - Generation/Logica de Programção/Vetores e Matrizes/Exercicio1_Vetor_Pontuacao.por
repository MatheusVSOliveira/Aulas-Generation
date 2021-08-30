/*1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
Encontre após a maior pontuação e a apresente. */
programa
{
	
	funcao inicio()
	{
		real pontuacao[5],maiorPontuacao=0.0
		inteiro i

		para (i = 0; i <= 4; i++)
		{
			escreva("Digite a pontuação da ",i+1, "ª atividade: ")
			leia(pontuacao[i])
			
			se (maiorPontuacao < pontuacao[i])
			{
				maiorPontuacao = pontuacao[i]
			}
		}
		para (i = 0; i <= 4; i++) 
		{
			escreva("\nA pontuação da ",i+1, "ª atividade é: ",pontuacao[i])
		}
		escreva("\nE a maior pontuacao foi: ", maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 8, 7, 9}-{maiorPontuacao, 8, 20, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */