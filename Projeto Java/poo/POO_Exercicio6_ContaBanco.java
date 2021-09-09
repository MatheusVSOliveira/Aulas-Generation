package poo;

public class POO_Exercicio6_ContaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco [] lista = new ContaBanco[3];
		
		lista[0] = new ContaBanco();
		lista[1] = new ContaBanco();
		lista[2] = new ContaBanco();
		 
		lista[0].setNumConta(5555500);
		lista[0].setDono("Matheus Oliveira");
		lista[0].abrirConta("CC"); 
		lista[0].depositar(500);
		
		lista[1].setNumConta(5008698);
		lista[1].setDono("Danielly Silva");
		lista[1].abrirConta("CP"); 
		lista[1].depositar(250);
		
		lista[2].setNumConta(6896545);
		lista[2].setDono("Maria de Paula");
		lista[2].abrirConta("CC");
		lista[2].depositar(1500);
		 
		 for (ContaBanco repeticao:lista) 
		 {
			 repeticao.estadoAtual();
		 }
	      
	}

}
