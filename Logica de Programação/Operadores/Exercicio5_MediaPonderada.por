programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,mediaPonderada
		
		escreva("Digite a primeira nota: ")
		leia(nota1)
		escreva("Digite a segunda nota: ")
		leia(nota2)
		escreva("Digite a terceira nota: ")
		leia(nota3)

		nota1 = nota1 * 2 // peso da nota é igual a 2
		nota2 = nota2 * 3 // peso da nota é igual a 3
		nota3 = nota3 * 5 // peso da nota é igual a 5

		mediaPonderada = (nota1 + nota2 + nota3) / (2+3+5)
		
		escreva("A média do aluno é: ", mediaPonderada)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */