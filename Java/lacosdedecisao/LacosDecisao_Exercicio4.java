package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio4 {

	public static void main(String[] args) {
		double num;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero qualquer: ");
		num = leia.nextFloat();
		if (num % 2 == 0) 
		{
			System.out.println("O n�mero digitado � par");
			System.out.printf("A sua ra�z quadrada �: %.2f" , Math.sqrt(num));
		}
		else
		{
			System.out.println("O n�mero digitado � �mpar");
			System.out.print("O n�mero " + num + " elevado ao quadrado �: " + Math.pow(num, 2));
		}
		leia.close();
	}
}
