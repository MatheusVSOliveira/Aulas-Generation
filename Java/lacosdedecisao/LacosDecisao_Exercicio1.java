package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio1 {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3 || num1 == num2 && num2 > num3)
		{
			System.out.print("O maior n�mero entre os 3 digitados �: " + num1);
		}
		else if (num2 > num1 && num2 > num3 || num2 == num1 && num1 > num3) 
		{
			System.out.print("O maior n�mero entre os 3 digitados �: " + num2);
		}
		else if (num3 > num1 && num3 > num2 || num3 == num1 && num1 > num2)
		{
			System.out.print("O maior n�mero entre os 3 digitados �: " + num3);
		}
		else
		{
			System.out.print("Os n�meros digitados s�o iguais: " + num1);
		}
	    leia.close();
    }
}	
