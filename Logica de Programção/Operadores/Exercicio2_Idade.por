programa
{
	
	funcao inicio()
	{
		inteiro idade,anos,meses, dias
		escreva("\nDigite a sua idade em dias: ")
		leia(dias)
		
		anos = dias / 365
		meses = (dias%365) / 30
		dias = (dias%365) % 30

		escreva("Voce tem ",anos, " ano(s), ", meses, " mes(es) e ", dias," dia(s) de idade!")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */