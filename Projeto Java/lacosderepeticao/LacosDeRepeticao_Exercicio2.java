/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
package lacosderepeticao;
import java.util.Scanner;
public class LacosDeRepeticao_Exercicio2 {
	public static void main (String[] args) {
		
		int cont,num,contPar=0,contImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(cont = 1; cont <= 10; cont++) 
		{
			System.out.printf("Digite o %dº número:",cont);
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
		System.out.printf("Dos número digitados %d são pares e %d são ímpares",contPar,contImpar);
		
	}
}
