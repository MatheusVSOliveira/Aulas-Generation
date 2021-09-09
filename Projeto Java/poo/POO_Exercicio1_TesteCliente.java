package poo;

public class POO_Exercicio1_TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente [] lista = new Cliente[3];
		
		lista[0] = new Cliente("Matheus Oliveira", "Rua Dahora", "000.000.000-41",999995555);
		lista[1] = new Cliente("Maria de Paula", "Rua Colorida", "000.000.000-42",999995556);
		lista[2] = new Cliente("Luiza Silva", "Rua Beaba", "000.000.000-43",999995557);
		
		lista[0].comprar();
		lista[0].pagarBoleto();
		
		lista[1].comprar();
		
		for(Cliente loop:lista) 
		{
			loop.imprimirDadosCompra();
		}
	}

}
