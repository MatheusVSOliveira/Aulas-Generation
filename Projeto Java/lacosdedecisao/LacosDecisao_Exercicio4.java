package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio4 {

	public static void main(String[] args) {
		double num;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		num = leia.nextFloat();
		if (num % 2 == 0) 
		{
			System.out.println("O número digitado é par");
			System.out.printf("A sua raíz quadrada é %.2f" , Math.sqrt(num));
		}
		else
		{
			System.out.println("O número digitado é ímpar");
			System.out.print("O número " + num + " elevado ao quadrado é " + Math.pow(num, 2));
		}
		leia.close();
	}

}
