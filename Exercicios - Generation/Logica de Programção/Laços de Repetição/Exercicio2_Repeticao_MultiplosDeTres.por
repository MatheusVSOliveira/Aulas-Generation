programa
{
	
	funcao inicio()
	{
		inteiro contador,acumulador=0

		para (contador = 0; contador <=500; contador+=3) {
			se (contador % 2 == 1) {
				acumulador += contador
				escreva("\n", contador)
			}

		}
		escreva("\nSoma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500: ",acumulador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */