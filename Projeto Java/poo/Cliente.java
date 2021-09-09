package poo;
import java.util.Scanner;
public class Cliente {
	Scanner leia = new Scanner(System.in);
	private String nome;
	private String endereco;
	private String formaPagamento;
	private String cpf;
	private int telCel;
	private int numProdutos;
	private String numCartao;
	
	
	public Cliente(String nome, String endereco, String cpf,int telCel) 
	{
	   	this.setNome(nome);
		this.setEndereco(endereco);
		this.setCpf(cpf);
		this.setTelCel(telCel);
		this.setFormaPagamento(formaPagamento);
		this.setNumProdutos(numProdutos);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getTelCel() {
		return telCel;
	}


	public void setTelCel(int telCel) {
		this.telCel = telCel;
	}


	public int getNumProdutos() {
		return numProdutos;
	}


	public void setNumProdutos(int numProdutos) {
		this.numProdutos = numProdutos;
	}
	
	
	public String getNumCartao() {
		return numCartao;
	}


	public void setNumCartao(String numCartão) {
		this.numCartao = numCartão;
	}
	
	public void comprar() 
	
	{
		System.out.println("Qual a forma de pagamento boleto ou cartão?");
		this.formaPagamento = leia.nextLine();
		
		if (this.getFormaPagamento().equalsIgnoreCase("boleto"))
		{
			System.out.println("Imprimindo o boleto..");
		}
		if (this.getFormaPagamento().equalsIgnoreCase("cartão")) 
		{
			System.out.println("Digite o número do cartão: ");
			this.numCartao = leia.nextLine();
			System.out.println("Compra realizada com sucesso!");
			this.numProdutos++;
		}
	}
	
	public void pagarBoleto() 
	
	{
		System.out.println("O boleto foi pago. Compra realizada com sucesso");
		this.numProdutos++;
	}
	
	public void imprimirDadosCompra() 
	{
		System.out.println("\nNome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nEndereço: " + this.getEndereco() + 
				"\nTelefone: " + this.getTelCel() + "\nForma de pagamento: " + this.getFormaPagamento() + "\nNúmero do cartão: " 
				+ this.getNumCartao() + "\nQuantidade  de produtos comprados: " + this.getNumProdutos());
	} 

	
}
