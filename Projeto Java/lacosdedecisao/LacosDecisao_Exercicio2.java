package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio2 {

	public static void main(String[] args) {
		
		int num1,num2,num3,maiorNum=0,menorNum=0,meioNum=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro número intero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num2 > num3 || num1==num2 && num2 > num3 || num1 > num2 && num2 == num3) 
		{
			maiorNum = num1;
			meioNum = num2;
			menorNum = num3;
		}
		else if (num1 > num3 && num3 > num2 || num1==num3 && num3 > num2) 
		{
			maiorNum = num1;
			meioNum = num3;
			menorNum = num2;
		}
		else if (num2 > num1 && num1 > num3 || num2 == num1 && num1 > num3 || num2 > num1 && num1 == num3) 
		{
			maiorNum = num2;
			meioNum = num1;
			menorNum = num3;
		}
		else if (num2 > num3 && num3 > num1 || num2 == num3 && num3 > num1) 
		{
			maiorNum = num2;
			meioNum = num3;
			menorNum = num1;
		}
		else if(num3 > num1 && num1 > num2 || num3 == num1 && num1 > num2 || num3 > num1 && num1 == num2) 
		{
			maiorNum = num3;
			meioNum = num1;
			menorNum = num2;
		}
		else if(num3 > num2 && num2 > num1 || num3 == num2 && num2 > num1) 
		{
			maiorNum = num3;
			meioNum = num2;
			menorNum = num1;
		}
		else 
		{
			maiorNum = num1;
			meioNum = num2;
			menorNum = num3;
		}
		
		
		System.out.print(menorNum+ " " + meioNum + " " + maiorNum);
	    leia.close();
    }
}	