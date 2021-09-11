package projetoreciclagem;
import java.util.Scanner;
public abstract class MaterialReciclavel {
	Scanner leia  = new Scanner(System.in);
	private String tipo;
	private String caracteristica;
	private int decomposicao;
	
	public MaterialReciclavel(String tipo, String caracteristica) 
	{
		super();
		this.setTipo(tipo);
		this.setCaracteristica(caracteristica);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getDecomposicao() {
		return decomposicao;
	}

	public void setDecomposicao(int decomposicao) {
		this.decomposicao = decomposicao;
	}
	
}
