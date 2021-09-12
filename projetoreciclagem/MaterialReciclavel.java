package projetoreciclagem;
import java.util.Scanner;
public abstract class MaterialReciclavel {
	Scanner leia  = new Scanner(System.in);
	private int tipo;
	private String escolha;
	public MaterialReciclavel() 
	{

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
	
}
