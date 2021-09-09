package poo;

public class ContaBanco {
	
//atributos
	private int numConta;
   	private String tipo;
	private String dono;
	private float saldo;
	private boolean status;
//métodos
	public ContaBanco() 
	
	{
		this.setSaldo(0);
	    this.setStatus(false);
	}
	
	public void estadoAtual() 
	
	{
		System.out.println("------------------------------");
	    System.out.println("Conta: " + this.getNumConta());
	    System.out.println("Tipo: " + this.getTipo());
	    System.out.println("Dono: " + this.getDono());
	    System.out.println("Saldo: " + this.getSaldo());
	    System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String conta) 
	
	{
	    this.setTipo(conta);
	    this.setStatus(true);
	    System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() 
	
	{
	    if (this.getSaldo() > 0) 
	    { //saldo > 0
	        System.out.println("Conta com dinheiro, não pode ser fechada");
	    } 
	    else if (this.getSaldo() < 0) 
	    { // saldo < 0
	        System.out.println("Conta em débito");
	    } 
	    else 
	    {
	        this.setStatus(false);
	        System.out.println("Conta fechada com sucesso");
	    }
	}
	
	public void depositar(float valor) 
	
	{
	    if (this.getStatus()) 
	    { //if (status == true)
	    	this.setSaldo(this.getSaldo() + valor); //saldo += v; 
	        System.out.println("Depósito realizado na conta de " + this.getDono());
	    } 
	    else 
	    {
	        System.out.println("Impossível depositar em uma conta fechada");
	    }
	}
	
	public void sacar(float valor) 
	
	{
	    if(this.getStatus())
	    {
	    	if(this.getSaldo() >= valor) 
	    	{
	    		this.setSaldo(this.getSaldo() - valor);
	            System.out.println("Saque realizado na conta de " + this.getDono());
	        } 
	    	else 
	    	{
	            System.out.println("Saldo insuficiente para saque");
	        }
	    } 
	    else 
	    {
	    	System.out.println("Impossível sacar de uma conta fechada");
	    }
	}
	
	public void pagarMensal() 
	
	{
		int valor = 0;
	    
		if (this.getTipo() == "CC")
	    {
	    	valor = 12;
	    } 
	    else if (this.getTipo() == "CP") 
	    {
	        valor = 20;
	    }
	    if(this.getStatus()) 
	    {
	    	if (this.getSaldo() > 0) 
	    	{
	    		this.setSaldo(this.getSaldo() + valor);
	            System.out.println("Mensalidade paga com sucesso");
	        } 
	    	else 
	    	{
	    		System.out.println("Saldo insuficiente");
	        }
	    } 
	    else 
	    {
	    	System.out.println("Impossível pagar uma conta fechada");
	    }
	}
	   
	public void setNumConta(int numConta) {
	       this.numConta = numConta;
	   }
	   
	public int getNumConta() 
	{
		return this.numConta;
	}
	   
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	   
	public String getTipo()
	{
		return this.tipo;
	}
	   
	public void setDono(String dono) 
	{
		this.dono = dono;
	}
	   
	public String getDono() 
	{
		return this.dono;
	}
	   
	public void setSaldo(float saldo) 
	{
		this.saldo = saldo;
	}
	   
	public float getSaldo() 
	
	{
		return this.saldo;
	}
	   
	public void setStatus(boolean status) 
	
	{
		this.status = status;
	}
	 
	public boolean getStatus() 
	
	{
		return this.status;
	}
}


