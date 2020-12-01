package Computador;

public class Imagem extends Documento {
	
	public Imagem (String nome, int endereco, int blocos) {
		super(nome, endereco, blocos);
	}
	
	public void abrir() {
		System.out.print("Photos - ");
		super.abrir();
	}
}
