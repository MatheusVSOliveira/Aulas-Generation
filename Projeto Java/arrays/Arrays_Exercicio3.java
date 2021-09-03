/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
package arrays;

import java.util.Scanner;

public class Arrays_Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[3][3];
		int somaMais10=0;
		Scanner leia = new Scanner(System.in);
		
		for(int l = 0; l < 3; l++) 
		{
			for(int c = 0; c < 3; c++) 
			{
				System.out.print("Digite um número: ");
				matriz[l][c] = leia.nextInt();
			}
		}
		
		System.out.println("Números digitados: ");
		
		for(int l = 0; l < 3; l++) 
		{
			for(int c = 0; c < 3; c++) 
			{
				System.out.print(matriz[l][c] + " ");
				
				if (matriz[l][c] > 10) 
				{
					somaMais10++;
				
				}
				
			}
		}
		
		System.out.print("\nTotal de números maiores que DEZ: " + somaMais10);
		leia.close();
	}

}
