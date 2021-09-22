package poo_heranca_ex1;

public class Cachorro extends Animal {
	
	private String somEmitido;
	private String locomocao;
	
	public Cachorro (String nome,int idade,int membros, float peso,float tamanho,String sexo) 
	{
		super(nome,idade,membros,peso,tamanho,sexo);
		this.setSomEmitido("Latido");
		this.setLocomocao("Andar e Correr");
	}
	
	
	public String getSomEmitido() {
		return somEmitido;
	}


	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}


	public String getLocomocao() {
		return locomocao;
	}


	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}


	public void emitirSom() 
	{
		System.out.println("Au! Au! Au!");
	}
	public void locomocao() 
	{
		System.out.println("Correndo!");
	}
	
	public void imprimirDados() 
	{
		System.out.println("Nome: " +getNome()+ " \nIdade: " +getIdade()+ " \nQuantidade de Membros: " +getMembros()+ "\nPeso(kg): " +getPeso()+ 
				"\nTamanho(cm): " +getTamanho()+ "\nSexo: " + getSexo() + "\nSom emitido: " + somEmitido + "\nManeira de locomoção: " +locomocao+ "\n");
	}
}
