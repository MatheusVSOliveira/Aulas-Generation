/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
package lacosderepeticao;
import java.util.Scanner;
public class LacosDeRepeticao_Exercicio2 {
	public static void main (String[] args) {
		
		int cont,num,contPar=0,contImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(cont = 1; cont <= 10; cont++) 
		{
			System.out.printf("Digite o %d� n�mero:",cont);
			num = leia.nextInt();
			
			if(num % 2 == 0) 
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
		}
		System.out.printf("Dos n�mero digitados %d s�o pares e %d s�o �mpares",contPar,contImpar);
		
	}
}
