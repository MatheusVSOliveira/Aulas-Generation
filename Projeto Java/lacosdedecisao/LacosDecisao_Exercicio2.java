package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio2 {

	public static void main(String[] args) {
/*
MENOR A A B B C C
MEIO  B C A C A A
MAIOR C B C A B A			 
*/
		
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro número intero: ");
		c = leia.nextInt();
		
		if(a <= b && b <= c) 
		{
			System.out.print(a + ", " + b + ", " + c);
		}
		else if (a <= c && c <= b) 
		{
			System.out.print(a + ", " + c + ", " + b);
		}
		else if (b <= a && a <= c )
		{
			System.out.print(b + ", " + a + ", " + c);
		}
		else if (b <= c && c <= a)
		{
			System.out.print(b + ", " + c + ", " + a);
		}
		else if(c <= a && a <= b) 
		{
			System.out.print(c + ", " + a + ", " + b);
		}
		else 
		{
			System.out.print(c + ", " + a + ", " + a);
		}
		leia.close();
    }
}	