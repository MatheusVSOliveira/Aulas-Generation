programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real P,E,M
		escreva("\n\t\t LIMITE DE PESO:50Kg")
		escreva("\nPara valores acima do limite permitido serão cobrados R$4,00 por quilo excedente.")
		escreva("\nEntre com o peso dos tomates em KG: ")
		leia(P)

		se(P > 50)
		{
			E = P - 50
			M = E * 4	
			escreva("\nPeso dos tomates(Kg): ",P,"\nPeso excedente(Kg): ", E,"\nMulta(R$): ",M)	
		}
		senao se(P <= 50) 
		{
			E = 0.0
			M = 0.0
			escreva("\nPeso dos tomates(Kg): ",P,"\nPeso excedente(Kg): ", E,"\nMulta(R$): ",M)	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */