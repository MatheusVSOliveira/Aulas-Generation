/*3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/
programa
{
	
	funcao inicio()
	{
		inteiro N1[3][3], N2[3][3], M1[3][3], M2[3][3],linhas,colunas
	

		para (linhas = 0; linhas < 3; linhas++) 
		{
			para(colunas=0; colunas < 3; colunas++) 
			{
				escreva("Entre com o N1: ")
				leia(N1[linhas][colunas])
				escreva("Entre com o N2: ")
				leia(N2[linhas][colunas])
				M1[linhas][colunas] = N1[linhas][colunas] + N2[linhas][colunas]
				M2[linhas][colunas] = N1[linhas][colunas] + N2[linhas][colunas]
			}
		}
		escreva("--- MATRIZ N1 ---")
		para (linhas = 0; linhas < 3; linhas++) 
		{
			escreva("\n")
			para(colunas=0; colunas < 3; colunas++) 
			{
				escreva(N1[linhas][colunas]," ")
			}
		}
		escreva("\n--- MATRIZ N2 ---")
		para (linhas = 0; linhas < 3; linhas++) 
		{
			escreva("\n")
			para(colunas=0; colunas < 3; colunas++) 
			{
				escreva(N2[linhas][colunas]," ")
			}
		}
		escreva("\nM1 --- MATRIZ SOMATÓRIA(N1 + N2)")
		para (linhas = 0; linhas < 3; linhas++) 
		{
			escreva("\n")
			para(colunas=0; colunas < 3; colunas++) 
			{
				escreva(M1[linhas][colunas]," ")
			}
		}
		escreva("\nM2 --- MATRIZ DE DIFERENÇA(N1 - N2)")
		para (linhas = 0; linhas < 3; linhas++) 
		{
			escreva("\n")
			para(colunas=0; colunas < 3; colunas++) 
			{
				escreva(M2[linhas][colunas]," ")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */