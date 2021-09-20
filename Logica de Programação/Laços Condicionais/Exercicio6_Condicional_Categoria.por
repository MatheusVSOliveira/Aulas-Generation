programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("\nEntre a idade do nadador e verifique a sua categoria: ")
		leia(idade)

		se (idade < 5) 
		{
			escreva("\nIdade insuficiente para a classificação em categorias.")
		}
		senao se (idade  < 8) 
		{
			escreva("\nCategoria: Infatil A")
		}
		senao se (idade >= 8 e idade < 12) 
		{
			escreva("\nCategoria: Infatil B")
		}
		senao se (idade >= 12 e idade < 14) 
		{
			escreva("\nCategoria: Juvenil A")
		}
		senao se (idade >= 14 e idade < 18) 
		{
			escreva("\nCategoria: Juvenil B")
		}
		senao 
		{
			escreva("\nAdulto")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */