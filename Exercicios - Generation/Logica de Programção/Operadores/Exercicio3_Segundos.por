programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro segundos,minutos,horas
		escreva("Digite o tempo de duração em segundos: ")
		leia(segundos)
		horas = segundos/3600
		minutos = (segundos%3600) / 60
		segundos = (segundos%3600) % 60

		escreva("\nHoras: ", horas, "\nMinutos: ", minutos, "\nSegundos: ", segundos)
	
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */