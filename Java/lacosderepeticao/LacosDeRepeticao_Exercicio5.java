package lacosderepeticao;

import java.util.Scanner;

public class LacosDeRepeticao_Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somaNum=0, num;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			somaNum += num;
		}
		while(num != 0);
		System.out.println("A soma dos n�meros digitados �: " + somaNum);
		leia.close();
	}

}
