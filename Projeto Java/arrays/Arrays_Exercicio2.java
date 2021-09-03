/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
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
			System.out.print("Digite um número INTEIRO qualquer: ");
			num[i] = leia.nextInt();
		}
		
		for (int i = 0; i < 5; i++) 
		{
			if (num[i] % 2 == 0) 
			{
				somaPar++;
				System.out.println(num[i] + " -> " + " Número PAR");
			}
			if(num[i] % 2 == 1) 
			{
				somaImpar++;
				System.out.println(num[i] + " -> " + " Número ÍMPAR");
			}
		}
		
		System.out.println("Quantidade de números PARES: " + somaPar);
		System.out.print("Quantidade de números ÍMPARES: " + somaImpar);
		leia.close();
	}
	
}
