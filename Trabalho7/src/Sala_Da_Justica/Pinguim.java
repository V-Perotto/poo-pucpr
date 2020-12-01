package Sala_Da_Justica;

public class Pinguim extends Ladrao {
	
	public Pinguim(int cor) {
		super(cor);
	}

	public void correr(float x, float y) {
		System.out.println("Pinguim correndo...");
		this.posicaoX = x;
		this.posicaoY = y;
	}
	
	public void saltar(float z) {
		System.out.println("Pinguim saltando...\t" + z);
		this.posicaoZ = z;
	}
	
	public void atirar() {
		System.out.println("Pinguim atirando...");
	}

}
