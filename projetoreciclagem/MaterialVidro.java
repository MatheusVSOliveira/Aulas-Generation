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
		
		System.out.println("SELECIONE A OP��O PARA O TIPO DE VIDRO QUE DESEJA DESCARTAR");
		System.out.println("[1]Garrafas\n[2]Cacos \n[3]Recipientes\n[4]Sair");
		setTipo(leia.nextInt());
		while(getTipo() < 1 || getTipo() > 4) 
		{
			System.out.println("Op��o inv�lida");
			System.out.println("SELECIONE A OP��O PARA O TIPO DE VIDRO QUE DESEJA DESCARTAR");
			System.out.println("[1]Garrafas\n[2]Cacos \n[3]Recipientes \n[4]Sair");
			setTipo(leia.nextInt());
		}
		switch(getTipo()) 
		{
		case 1:
			System.out.println("Coloque as garrafas em uma caixa ou agrupe-as em jornais.\nProcure cooperativas de reciclagem ou pontos de entregas volunt�rias!");
			break;
		case 2:
			System.out.println("Cuidadosamente embrulhe os cacos em jornais ou pap�is.\nProcure cooperativas de reciclagem ou pontos de entregas volunt�rias!");
			break;
		case 3:
			System.out.println("Coloque os recipientes em uma caixa ou agrupe-os em jornais.\nProcure cooperativas de reciclagem ou pontos de entregas volunt�rias!");
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
	}
	
	@Override
	public void danoAmbiente() 
	{
		if(getTipo() == 1) 
		{
			System.out.println("Voc� deixar� de descartar " +garrafas+ " garrafas de vidro no meio ambiente! Parab�ns!");
		}
		if(getTipo() == 2) 
		{
			System.out.println("Voc� deixar� de descartar " +cacos+ " gramas de cacos vidros no meio ambiente!\nIsso evita que animais e seres humanos se machuquem! Parab�ns!");
		}
		if(getTipo() == 3) 
		{
			System.out.println("\"Voc� deixar� de descartar " +recipientes+ " recipientes de vidro no meio ambiente! Parab�ns!");
			
		}
	}
	
	

    @Override
    public void reutilizar() 
    {
	
    }
	
	
}
