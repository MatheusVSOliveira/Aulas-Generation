programa
{
	
	funcao inicio()
	{
		inteiro idade,anos,meses, dias
		escreva("Digite a sua idade com os anos, meses e dias, respectivamente: ")
		escreva("\nAnos: ")
		leia(anos)
		escreva("Mes(s): ")
		leia(meses)
		escreva("Dia(s): ")
		leia(dias)

		idade = (anos * 365) + (meses * 30) + dias 
		escreva("Você tem ", idade, " dias de idade!" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */