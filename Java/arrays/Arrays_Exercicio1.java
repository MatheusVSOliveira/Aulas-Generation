/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
package arrays;

public class Arrays_Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A [] = {1,0,5,-2,-5,7};
		int soma = A[0] + A[1] + A[5]; 
		System.out.println("Vetores: " + A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4] + " " + A[5]);
		System.out.println("A soma entre os valores da posi��o A[0], A[1] e A[5] �: " + soma);
		A[4] = 100;
		System.out.println("Vetores com alter��o na posi��o A[4]: \nvetor A[0]: " + A[0] + "\nvetor A[1]: " + A[1] + "\nvetor A[2]: " + A[2] + "\nvetor A[3]: " + A[3] + 
				"\nvetor A[4]: " + A[4] + "\nvetor A[5]: " + A[5]);
	}

}
