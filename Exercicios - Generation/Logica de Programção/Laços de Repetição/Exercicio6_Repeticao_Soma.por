/*2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. */
programa
{
	
	funcao inicio()
	{
		inteiro numero, contagem = 0, atual=0
		escreva("Digite um número qualquer do teclado: ")
		leia(numero)
		faca {
			contagem += atual
			atual++
		} enquanto(atual <= numero )

		escreva("A soma do número 1 até ",numero, " é ", contagem)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = 16, 8, 9, 10, 13;
 * @SIMBOLOS-INSPECIONADOS = {numero, 8, 10, 6}-{contagem, 8, 18, 8}-{atual, 8, 32, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */