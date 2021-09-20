/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
ou seja, diagonal principal.*/
programa
{
	
	funcao inicio()
	{
		real matriz[3][3],somaValores=0.0,somaDiagonal=0.0
		inteiro linhas,colunas

		para(linhas = 0; linhas < 3; linhas++) 
		{
			para(colunas = 0; colunas < 3; colunas++) 
			{
				escreva("Entre com um número qualquer: ")
				leia(matriz[linhas][colunas])
				somaValores += matriz[linhas][colunas]

				se(linhas == colunas) 
				{
					somaDiagonal += matriz[linhas][colunas]
				}
			}
			
		}
		escreva("\nMATRIZ 3X3")
		escreva("\n-------------")
		para(linhas = 0; linhas < 3; linhas++)
		{
			escreva("\n")
			para(colunas = 0; colunas < 3; colunas++)
			{
				escreva(matriz[linhas][colunas]," ")
			}
		}
		escreva("\n-------------")
		escreva("\nSoma dos valores da Matriz: ", somaValores)
		escreva("\nSoma da diagonal principal: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 868; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 9, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */