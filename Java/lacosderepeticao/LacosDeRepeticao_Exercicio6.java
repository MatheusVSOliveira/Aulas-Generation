package lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticao_Exercicio6 {
	
	public static void main(String[] args) {
		
		int somaNum=0, num,soma=0;
		float media=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 ) {
			somaNum+= num;
			soma++;
			}
		}
		while(num != 0);
		media = somaNum / soma;
		System.out.printf("A m�dia dos n�meros digitados �: %.2f",media);
		leia.close();
	}
}
