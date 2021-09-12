package projetoreciclagem;

public class MaterialVidro extends MaterialReciclavel implements Reciclagem {
	
	private int garrafas;
	private double cacos;
	private int recipientes;
	
	public MaterialVidro() 
	{
	
	}
	
	public int getGarrafas() {
		return garrafas;
	}
	public void setGarrafas(int garrafas) {
		this.garrafas = garrafas;
	}
	public double getCacos() {
		return cacos;
	}
	public void setCacos(double cacos) {
		this.cacos = cacos;
	}
	public int getRecipientes() {
		return recipientes;
	}
	public void setRecipientes(int recipientes) {
		this.recipientes = recipientes;
	}
	@Override
	public void descartar() {
		
		System.out.println("SELECIONE A OPÇÃO PARA O TIPO DE VIDRO QUE DESEJA DESCARTAR");
		System.out.println("[1]Garrafas\n[2]Cacos \n[3]Recipientes\n[4]Sair");
		setTipo(leia.nextInt());
		while(getTipo() < 1 || getTipo() > 4) 
		{
			System.out.println("Opção inválida");
			System.out.println("SELECIONE A OPÇÃO PARA O TIPO DE VIDRO QUE DESEJA DESCARTAR");
			System.out.println("[1]Garrafas\n[2]Cacos \n[3]Recipientes \n[4]Sair");
			setTipo(leia.nextInt());
		}
		switch(getTipo()) 
		{
		case 1:
			System.out.println("Coloque as garrafas em uma caixa ou agrupe-as em jornais.\nProcure cooperativas de reciclagem ou pontos de entregas voluntárias!");
			break;
		case 2:
			System.out.println("Cuidadosamente embrulhe os cacos em jornais ou papéis.\nProcure cooperativas de reciclagem ou pontos de entregas voluntárias!");
			break;
		case 3:
			System.out.println("Coloque os recipientes em uma caixa ou agrupe-os em jornais.\nProcure cooperativas de reciclagem ou pontos de entregas voluntárias!");
			break;
		default:
			System.out.println("Saindo...");
		}
		
		
	}
	
	
	@Override
	public void calcularReciclaveis() 
	{
		if(getTipo() == 1) 
		{
			System.out.println("\nInforme a quantidade de garrafas a serem descartadas:");
			garrafas = leia.nextInt();
		}
		if(getTipo() == 2) 
		{
			System.out.println("\nInforme a quantidade de cacos em gramas a serem descartados:");
			cacos = leia.nextInt();
		}
		if(getTipo() == 3) 
		{
			System.out.println("\nInforme a quantidade de recipientes a serem descartados:");
			recipientes = leia.nextInt();
		}
		this.danoAmbiente();
	}
	
	@Override
	public void danoAmbiente() 
	{
		if(getTipo() == 1) 
		{
			System.out.println("Você deixará de descartar " +garrafas+ " garrafas de vidro no meio ambiente! Parabéns!");
		}
		if(getTipo() == 2) 
		{
			System.out.println("Você deixará de descartar " +cacos+ " gramas de cacos vidros no meio ambiente!\nIsso evita que animais e seres humanos se machuquem! Parabéns!");
		}
		if(getTipo() == 3) 
		{
			System.out.println("Você deixará de descartar " +recipientes+ " recipientes de vidro no meio ambiente! Parabéns!");
			
		}
		
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
				+ "- Ao reciclar ou reutilizar, evitamos a geração de resíduos de vidro. \n"
                + "- Reduzimos o consumo de água.\n"
                + "- O descarte equivocado do vidro é responsável por gerar consequências como o ferimentos de animais e humanos.\n"
		        + "- O vidro demora mais de mil anos para se decompor no meio ambiente.");
	}
	
	

    @Override
    public void reutilizar() 
    {
    	
    	System.out.println("Selecione o tipo de vidro a ser reutilizado ou descartado: \n[1]Garrafas\n[2]Cacos\n[3]Recipientes");
		setTipo(leia.nextInt());
		while(getTipo() < 1 || getTipo() > 3) 
		{
			System.out.println("Opção inválida! Selecione o tipo de vidro a ser reutilizado ou descartado: \n[1]Garrafas\n[2]Cacos\n[3]Recipientes");
			setTipo(leia.nextInt());
		}
    	if(getTipo() == 1) 
		{
			System.out.println("Reutilize as suas garrafas para armazenar coisas de seu interesse! Ou leve para um centro de coleta de materiais recicláveis");
		}
		if(getTipo() == 2) 
		{
			System.out.println("Pedaços de vidros não podem ser reutilizados! Embrulhe com cuidado e leve para um centro de coleta de materiais recicláveis");
		}
		if(getTipo() == 3) 
		{
			System.out.println("Reutilize os seus recipientes para armazenar coisas de seu interesse! Ou leve para um centro de coleta de materiais recicláveis");
			
		}
    }
	
	
}
