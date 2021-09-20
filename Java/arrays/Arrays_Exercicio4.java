/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
*/package arrays;

import java.util.Scanner;

public class Arrays_Exercicio4 {

	public static void main(String[] args) {
		
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];
		int opcao=0;
		float constante;
		Scanner leia = new Scanner(System.in);
		
		for (int l = 0; l < 2; l++) //Entrada de dados na Matriz
		{
			for(int c = 0; c < 2; c++)
			{
				System.out.print("Digite o n�mero para preeencher a 1� matriz: ");
				matriz1[l][c] = leia.nextFloat();
				System.out.print("Digite o n�mero para preeencher a 2� matriz: ");
				matriz2[l][c] = leia.nextFloat();	
			}
		}
		
		System.out.println("Digite a op��o desejada:");
		System.out.println("[1] Somar as duas matrizes");
		System.out.println("[2] Subtrair a primeira matriz da segunda ");
		System.out.println("[3] Adicionar uma constante as duas matrizes");
		System.out.println("[4] Imprimir as matrizes ");
		System.out.println("[5] Sair ");
		opcao = leia.nextInt();
		while (opcao < 1 || opcao > 5) {
			System.out.println("Op��o inv�lida! Escolha uma nova op��o");
			System.out.println("Digite a op��o desejada:");
			System.out.println("[1] Somar as duas matrizes");
			System.out.println("[2] Subtrair a primeira matriz da segunda ");
			System.out.println("[3] Adicionar uma constante as duas matrizes");
			System.out.println("[4] Imprimir as matrizes ");
			System.out.println("[5] Sair ");
			opcao = leia.nextInt();
		}
		
		if (opcao == 1)
		{
			for (int l = 0; l < 2; l++) //Soma das Matrizes
			{
				for(int c = 0; c < 2; c++)
				{
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];	
				}
			}
			
			System.out.println("--SOMA DAS MATRIZES--");
			for (int l = 0; l < 2; l++) 
			{
				for(int c = 0; c < 2; c++)
				{
					System.out.print(matriz3[l][c] + " ");	
				}
				System.out.println(" ");
			}
		}
		else if(opcao == 2) 
		{
			for (int l = 0; l < 2; l++) //Subtra��o das Matrizes
			{
				for(int c = 0; c < 2; c++)
				{
					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];	
				}
			}
			System.out.println("--DIFEREN�A DAS MATRIZES--");
			for (int l = 0; l < 2; l++) 
			{
				for(int c = 0; c < 2; c++)
				{
					System.out.print(matriz3[l][c] + " ");	
				}
				System.out.println(" ");
			}
		}
		else if(opcao == 3) 
		{
			System.out.print("Digite uma constante para somar com as matrizes 1 e 2: ");
			constante = leia.nextFloat();
			for (int l = 0; l < 2; l++) 
			{
				for(int c = 0; c < 2; c++)
				{
					matriz1[l][c] += constante;
					matriz2[l][c] += constante;	
				}
			}
			System.out.println("--MATRIZ1 COM A CONSTANTE--"); //Leitura da matriz1 com a constante
			for (int l = 0; l < 2; l++) 
			{
				for(int c = 0; c < 2; c++)
				{
					System.out.print(matriz1[l][c] + " ");	
				}
				System.out.println(" ");
			}
			System.out.println("--MATRIZ2 COM A CONSTANTE--"); //Leitura da matriz2 com a constante
			for (int l = 0; l < 2; l++) 
			{
				for(int c = 0; c < 2; c++)
				{
					System.out.print(matriz2[l][c] + " ");	
				}
				System.out.println(" ");
			}
		}
		else if(opcao == 4) 
		{
			System.out.println("---MATRIZ1---");
			for (int l = 0; l < 2; l++) //Sa�da de dados na Matriz1
			{
				for(int c = 0; c < 2; c++)
				{
					System.out.print(matriz1[l][c] + " ");
					
				}
				System.out.println("");
			}
			
			System.out.println("---MATRIZ2---");
			for (int l = 0; l < 2; l++) //Sa�da de dados na Matriz2
			{
				for(int c = 0; c < 2; c++)
				{
					System.out.print(matriz2[l][c] + " ");
					
				}
				System.out.println("");
			}
		}
		else 
		{
			System.out.println("Obrigado por utilizar o nosso programa! Saindo...");
		}
		leia.close();
	}

}
