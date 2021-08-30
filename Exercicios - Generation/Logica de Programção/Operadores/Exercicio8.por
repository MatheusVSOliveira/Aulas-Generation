programa
{
	
	funcao inicio()
	{
		real custoFabrica,custoDistribuidor, custoImpostos, custoConsumidor
		
		escreva("Digite o custo de fábrica do carro: R$")
		leia(custoFabrica)
		
		custoDistribuidor = custoFabrica*28 / 100
		custoImpostos = custoFabrica*45 / 100
		custoConsumidor = custoFabrica + custoDistribuidor + custoImpostos

		escreva("O custo para o consumidor é de R$", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */