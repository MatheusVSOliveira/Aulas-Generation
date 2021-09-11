package projetoreciclagem;

public class MaterialPapel extends MaterialReciclavel implements Reciclagem {
	
	private String jornal;
	private String revista;
	private String papelao;
	private String embalagem;
	
	public MaterialPapel(String tipo, String caracteristica)
	{
		super(tipo, caracteristica);
		
	}
	
	
	
	public String getJornal() {
		return jornal;
	}



	public void setJornal(String jornal) {
		this.jornal = jornal;
	}



	public String getRevista() {
		return revista;
	}



	public void setRevista(String revista) {
		this.revista = revista;
	}



	public String getPapelao() {
		return papelao;
	}



	public void setPapelao(String papelao) {
		this.papelao = papelao;
	}



	public String getEmbalagem() {
		return embalagem;
	}



	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}



	@Override
	public void descartar() 
	{
		int estado;
		System.out.println("Qual o estado do papel que deseja descartar? \n1-Limpo \n2-Sujo \n3-Contaminado biologicamente e/ou quimicamente?");
		estado = leia.nextInt();
		
		if (estado == 1) 
		{
			System.out.println("Descarte em uma sacola separada e leve-o para um centro de reciclagem");
		}
		if (estado == 2) 
		{
			System.out.println("Verifique se a sujeira não está contaminada biologicamente ou quimicamente, se não estiver, descarte no lixo orgânico");
		}
		if (estado == 3) 
		{
			System.out.println("Separe-o em uma embalagem somente para esse tipo de papel e descarte-o no lixo");
		}
	}
	
	@Override
	public void danoAmbiente() 
	{
		
		
	}
	
	@Override
	public void reutilizar() 
	{
		
		
	}	
	
}
