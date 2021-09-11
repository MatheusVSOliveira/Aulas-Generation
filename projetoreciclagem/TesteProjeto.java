package projetoreciclagem;

public class TesteProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaterialVidro garrafa = new MaterialVidro();
		garrafa.descartar();
		garrafa.calcularReciclaveis();
		garrafa.danoAmbiente();
		System.out.println(garrafa.getGarrafas());
	}

}
