/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
package lacosderepeticao;
import java.util.Scanner;
public class LacosDeRepeticao_Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totPessoas21=0, totPessoas50=0,idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) 
		{
			if(idade < 21) 
			{
				totPessoas21++;
			}
			else if (idade > 50)
			{
				totPessoas50++;	
			}
			
			System.out.print("Entre com a sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("Menores de 21 anos: " + totPessoas21);
		System.out.println("Maiores de 50 anos: " + totPessoas50);
		leia.close();
	}

}
