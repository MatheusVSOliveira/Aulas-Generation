/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
programa
{
	
	funcao inicio()
	{
		real numero=0.0, somatorio=0.0,media=0.0,totalDeValores=0.0
		inteiro valoresLidos=0

		escreva("Digite um número qualquer: ")
		leia(numero)
		enquanto(numero >= 0) {
			somatorio+=numero
			media++
			valoresLidos++
			escreva("\nDigite um número qualquer: ")
		     leia(numero)
		}
		escreva("\nTotal de somatório: ", somatorio)
		escreva("\nMédia: ", somatorio/media)
		escreva("\nTotal de valores lidos: ", valoresLidos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */