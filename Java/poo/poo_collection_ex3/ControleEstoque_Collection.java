package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleEstoque_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login;
		String senha;
		String validaLogin;
		String validaSenha;
		boolean valida1=false;
		boolean valida2=false;
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList <String> estoque = new ArrayList();
		
		System.out.println("\nCrie um login para ter acesso ao estoque:");
		login = leia.nextLine();
		System.out.println("\nCrie uma senha de 8 digitos para ter acesso ao estoque:");
	    senha = leia.nextLine();
	    
	    do 
	    {
	    	
	    	if(senha.length()!= 8) 
	    	{
	    		System.out.println("Senha inv�lida! Crie uma nova senha de 8 digitos");
	    		senha = leia.nextLine();
	    	}
	    	else
	    	{
	    		System.out.println("Senha e login criados com sucesso!");
	    	}
	    } while(senha.length() != 8);
		
	    do
	    {
	    	System.out.println("\n    ======= LOJAS MAISTECH =======");
    		System.out.println("======= CONTROLE DE ESTOQUE =======");
    		System.out.println("\nEntre com o login: ");
    		validaLogin = leia.nextLine();
    		System.out.println("\nEntre com a senha: ");
    		validaSenha = leia.nextLine();  
	    	if(validaLogin.equalsIgnoreCase(login) && validaSenha.equalsIgnoreCase(senha))
	    	{
	    		valida1 = true;
	    	}
	    	else 
	    	{
	    		System.out.println("Senha ou login incorretos!Tente novamente!");   
	    	}
	    	
	    } while(!valida1);
	    
		do
		{
			System.out.println("\n    ======= LOJAS MAISTECH =======");
			System.out.println("======= CONTROLE DE ESTOQUE =======");
			System.out.println("\n\tLista de op��es");
			System.out.println("\n[1]Deseja adicionar produtos ao estoque?");
			System.out.println("\n[2]Deseja remover produtos do estoque?");
			System.out.println("\n[3]Deseja atualizar produtos do estoque?");
			System.out.println("\n[4]Mostrar todos os produtos do estoque?");
			System.out.println("\n[0]Deseja encerrar o programa?");
			System.out.println("\nDigite a op��o desejada?");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicion�-lo ao estoque:");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remov�-lo do estoque:");
				String removeProduto = leia.nextLine();
				if(estoque.contains(removeProduto))
				{
					estoque.remove(removeProduto);
				}
				else
				{
					System.out.println("\nProduto n�o encontrado no estoque!");
				}
				System.out.println("\nEstoque: " +estoque);
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verificaProduto = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrar� no lugar do produto: " +verificaProduto);
				String novoProduto = leia.nextLine();
				
				if(estoque.contains(verificaProduto))
				{
					estoque.remove(verificaProduto);
					estoque.add(novoProduto);
				}
				else
				{
					System.out.println("\nProduto n�o existe no estoque! Verifique a escrita do produto!");
				}
				System.out.println("\nEstoque: " +estoque);
				break;
				
			case 4:
				if (estoque.isEmpty()) 
				{
					System.out.println("N�o h� produtos registrados no estoque");
				}
				else
				{
				System.out.println("\nOs produtos do estoque s�o: "+estoque);
				}
				break;
			case 0:
				System.out.println("Fechando sistema de estoque...");
				valida2 = true;
			default:
				System.out.println("\nOp��o inv�lida!!!");
				
			}
		} while(!valida2);
	
	}

}
