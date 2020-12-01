package Sala_Da_Justica;

public class Goldfinger extends Terrorista {

	Heroi heroi;

	public Goldfinger(int cor) {
		super(cor);
	}
	
	public void saltar(float z) {
		System.out.println("Goldfinger saltando...\t" + z);
		this.posicaoZ = z;
	}
	
	public void personificar(Heroi heroi) {
		System.out.println("Goldfinger personificando James Bond");
		this.heroi = heroi;
	}
	
	public void camuflar(int cor) {
		System.out.println("Goldfinger camuflando...");
		this.cor = cor;
	}
	
}
