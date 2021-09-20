programa
{
	
	funcao inicio()
	{
		real indiceDePoluicao

		escreva("\nEntre com o indice de poluição do meio ambiente atingido: ")
		leia(indiceDePoluicao)

		se(indiceDePoluicao  <= 0.25) 
		{
			escreva("\nÍndice de poluição dentro do limite aceitável pela Secretária Ambiental!")
		}
		senao se(indiceDePoluicao < 0.3) 
		{
			escreva("\nÍndice de poluição fora do limite aceitável pela Secretaria Ambiental!")
		}
		senao se(indiceDePoluicao >= 0.3 e indiceDePoluicao < 0.4) 
		{
			escreva("\nA indústria do grupo 1 está intimada a suspender as suas atividades!")
		}
		senao se (indiceDePoluicao >= 0.4 e indiceDePoluicao < 0.5)
		{
			escreva("\nAs indústrias dos grupos 1 e 2 estão intimadas a suspenderem as suas atividades!")
		}
		senao 
		{
			escreva("\nAs indústrias dos grupos 1,2 e 3 estão intimadas a suspenderem as suas atividades!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */