/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/
package arrays;
import java.util.Scanner;
public class Arrays_Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num [] = new int [5];
		int somaPar=0,somaImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um n�mero INTEIRO qualquer: ");
			num[i] = leia.nextInt();
		}
		
		for (int i = 0; i < 5; i++) 
		{
			if (num[i] % 2 == 0) 
			{
				somaPar++;
				System.out.println(num[i] + " -> " + " N�mero PAR");
			}
			if(num[i] % 2 == 1) 
			{
				somaImpar++;
				System.out.println(num[i] + " -> " + " N�mero �MPAR");
			}
		}
		
		System.out.println("Quantidade de n�meros PARES: " + somaPar);
		System.out.print("Quantidade de n�meros �MPARES: " + somaImpar);
		leia.close();
	}
	
}
