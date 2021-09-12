package projetoreciclagem;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaterialPapel papel = new MaterialPapel();
		//papel.descartar();
		//papel.calcularReciclaveis();
		//papel.danoAmbiente(); // será chamado no método calcular
		//papel.reutilizar();
		
		MaterialVidro vidro = new MaterialVidro();
		//vidro.descartar();
		//vidro.calcularReciclaveis();
		//vidro.danoAmbiente(); //será chamado no método calcular
		//vidro.reutilizar();
		
		MaterialPlastico plastico = new MaterialPlastico();
		//plastico.descartar();
		//plastico.calcularReciclaveis();
		//plastico.danoAmbiente(); //será chamado no método calcular
		//plastico.reutilizar();
		
		MaterialEspecial especial = new MaterialEspecial();
		//especial.descartar();
		//especial.calcularReciclaveis();
		//especial.danoAmbiente(); //será chamado no método calcular
		//especial.reutilizar();
		
		MaterialMetal metal = new MaterialMetal();
		//metal.descartar();
		//metal.calcularReciclaveis();
		//metal.danoAmbiente(); //será chamado no método calcular
		metal.reutilizar();
	}

}
