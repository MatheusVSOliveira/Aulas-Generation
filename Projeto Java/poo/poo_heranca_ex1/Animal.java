package poo_heranca_ex1;

public class Animal {
	private String nome;
	private int idade;
	private int membros;
	private float peso;
	private float tamanho;
	private String sexo;
	
	public Animal(String nome,int idade,int membros, float peso,float tamanho,String sexo) 
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
		this.tamanho = tamanho;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
