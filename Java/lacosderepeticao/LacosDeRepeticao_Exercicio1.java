/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)*/
package lacosderepeticao;

public class LacosDeRepeticao_Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont;
		
		for(cont=1000; cont<=1999; cont++) 
		{
			if(cont % 11 == 5) 
			{
				System.out.print(cont + " ");
			}
		}
	}
}
