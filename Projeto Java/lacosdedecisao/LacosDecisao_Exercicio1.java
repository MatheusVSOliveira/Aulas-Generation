package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio1 {

	public static void main(String[] args) {
		
		
		
		int num1,num2,num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro número intero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3 || num1 == num2 && num2 > num3)
		{
			System.out.print("O maior número entre os 3 digitados é: " + num1);
		}
		else if (num2 > num1 && num2 > num3 || num2 == num1 && num1 > num3) 
		{
			System.out.print("O maior número entre os 3 digitados é: " + num2);
		}
		else if (num3 > num1 && num3 > num2 || num3 == num1 && num1 > num2)
		{
			System.out.print("O maior número entre os 3 digitados é: " + num3);
		}
		else
		{
			System.out.print("Os números digitados são iguais: " + num1);
		}
	    leia.close();
    }
}	
