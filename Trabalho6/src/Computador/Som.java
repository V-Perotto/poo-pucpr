package Computador;

public class Som extends Documento {
	
	public Som (String nome, int endereco, int blocos) {
		super(nome, endereco, blocos);
	}
	
	public void abrir() {
		System.out.print("Music Player - ");
		super.abrir();
	}
}
