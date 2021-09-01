package lacosdedecisao;
import java.util.Scanner;
public class LacosDecisao_Exercicio3 {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com a sua idade: ");
		idade = leia.nextInt();

		if (idade < 10) 
		{
			System.out.print("Categoria: Criança");
		}
		else if (idade >= 10 && idade <= 14) 
		{
			System.out.print("Categoria: Infantil");
		}
		else if (idade > 14 && idade <= 17) 
		{
			System.out.print("Categoria: Juvenil");
		}
		else if (idade > 17 && idade <= 25) 
		{
			System.out.print("Categoria: Adulto");
		}
		else 
		{
			System.out.print("Sem categoria");
		}
		leia.close();
	}
}
