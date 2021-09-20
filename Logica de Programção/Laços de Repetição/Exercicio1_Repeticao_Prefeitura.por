/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00. */ 

programa
{
	
	funcao inicio()
	{
		real mediaSalario,maiorSalario=0.0,percentual=0.0,salario,somaSalario = 0.0,mediaFilhos,somaFilhos=0.0
		inteiro contador,filhos

		para (contador = 1; contador <= 5; contador++) {
			
			escreva("Digite o salário da ",contador,"ª pessoa: R$")
			leia(salario)
			escreva("Digite a quantidade de filhos da ",contador, "ª pessoa: ")
			leia(filhos)

			somaSalario+= salario
			somaFilhos+= filhos

			se(salario > maiorSalario) {
				maiorSalario = salario
			}

			se(salario <= 100) {
				percentual++
			}
			
		}

		mediaSalario = somaSalario / (contador-1)
		mediaFilhos = somaFilhos / (contador-1)
		percentual = percentual * 100 / (contador-1)

		escreva("\nMédia do salário da população: R$", mediaSalario)
		escreva("\nMédia do número de filhos: ",mediaFilhos)
		escreva("\nMaior salário: R$",maiorSalario)
		escreva("\nPercentual de pessoas com salário até R$100,00: ",percentual,"%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1039; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorSalario, 12, 20, 12}-{salario, 12, 52, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */