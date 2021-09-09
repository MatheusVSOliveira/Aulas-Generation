package poo_heranca_ex1;

public class Heranca_ex1_TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro dog = new Cachorro("Lucky",2,4,10,20,"M");
		Cavalo alazao = new Cavalo("Pé de pano",6,4,380,180,"F");
		Preguica preguica = new Preguica("Billy",3,4,6,70,"M");
		
		System.out.println("*****DADOS DO ANIMAIS******");
		dog.imprimirDados();
		alazao.imprimirDados();
		preguica.imprimirDados();
		
		System.out.println("Escute os sons dos cachorro, cavalo e preguiça, respectivamente: ");
		dog.emitirSom();
		alazao.emitirSom();
		preguica.emitirSom();
		System.out.println("\nVeja como o cachorro, o cavalo e a preguiça, estão se locomovendo, respectivamente: ");
		dog.locomocao();
		alazao.locomocao();
		preguica.locomocao();
	}

}
