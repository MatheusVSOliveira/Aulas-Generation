/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o n�mero de pessoas calmas;
 o n�mero de mulheres nervosas;
 o n�mero de homens agressivos;
 o n�mero de outros calmos;
 o n�mero de pessoas nervosas com mais de 40 anos;
 o n�mero de pessoas calmas com menos de 18 anos.*/
package lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticao_Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pCalmas=0,mNervosas=0,hAgressivos=0,oCalmos=0,pNervosas40=0,pCalmas18=0,
		cont=1,idade,escolhaS,escolhaP;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		while (cont < 5) 
		{
			System.out.print("Digite a sua idade? ");
			idade = leia.nextInt();
			while (idade < 1 || idade > 120) 
			{
				System.out.println("Idade inv�lida!");
				System.out.println("Insira a idade novamente:");
				idade = leia.nextInt();
			}
			System.out.println("Digite a op��o desejada para preencher o seu sexo:");
			System.out.println("[1] FEMININO \n[2] MASCULINO \n[3] OUTROS");
			escolhaS = leia.nextInt();
			while (escolhaS < 1 || escolhaS > 3) 
			{
				System.out.println("Op��o inv�lida!");
				System.out.println("Digite a op��o desejada para preencher o seu sexo:");
				System.out.println("[1] FEMININO \n[2] MASCULINO \n[3] OUTROS");
				escolhaS = leia.nextInt();
			}
			System.out.println("Digite a op��o desejada para calma, nervosa ou agressiva:");	
			System.out.println("[1] CALMA \n[2] NERVOSA \n[3] AGRESSIVA");
			escolhaP = leia.nextInt();
			while (escolhaP < 1 || escolhaP > 3) 
			{
				System.out.println("Op��o inv�lida!");
				System.out.println("Digite a op��o desejada para calma, nervosa ou agressiva:");	
				System.out.println("[1] CALMA \n[2] NERVOSA \n[3] AGRESSIVA");
				escolhaP = leia.nextInt();
			}
			System.out.println("--------------------------------------");
			System.out.println("idade: " + idade + " sexo: " + escolhaS + " fator psicol�gico: " + escolhaP);
			System.out.println("--------------------------------------");
			
			if(escolhaP == 1) 
			{
				pCalmas++;
			}
			if (escolhaS == 1 && escolhaP == 2) 
			{
				mNervosas++;
			}
			if(escolhaS == 2 && escolhaP == 3)
			{
				hAgressivos++;
			}
			if (escolhaS == 3 && escolhaP == 1) 
			{
				oCalmos++;
			}
			if(escolhaP == 2 && idade > 40) 
			{
				pNervosas40++;
			}
			if(escolhaP == 1 && idade < 18) 
			{
				pCalmas18++;
			}
						
			cont++;
		}
		System.out.println("o n�mero de pessoas calmas: " + pCalmas);
		System.out.println("o n�mero de mulheres nervosas: " + mNervosas);
		System.out.println("o n�mero de homens agressivos: " + hAgressivos);
		System.out.println("o n�mero de outros calmos: " + oCalmos);
		System.out.println("o n�mero de pessoas nervosas com mais de 40 anos: " + pNervosas40);
		System.out.println("o n�mero de pessoas calmas com menos de 18 anos: " + pCalmas18);
		leia.close();
	}

}
