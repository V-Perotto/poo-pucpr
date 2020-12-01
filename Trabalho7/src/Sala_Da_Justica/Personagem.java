package Sala_Da_Justica;

public abstract class Personagem {
	
	private boolean vivo;
	protected float posicaoX;
	protected float posicaoY;
	protected float posicaoZ;
	protected int cor;
	Heroi heroi;

	public Personagem(int cor) {
		this.cor = cor;
	}

	public void correr(float x, float y) {
		System.out.println("C correndo...");
		this.posicaoX = x;
		this.posicaoY = y;
	}
	
	public void saltar(float z) {
		System.out.println("C saltando...");
		this.posicaoZ = z;
	}
	
	public void atirar() {
		System.out.println("C atirando...");
	}
	
	public void morrer(boolean vivo) {
		System.out.println("Morto");
		this.vivo = vivo;
		vivo = false;
	}
	
	public void camuflar(int cor) {
		System.out.println("C camuflando...");
	}	
	
	public void personificar(Heroi h) {
		h = (Heroi)heroi;
		System.out.println("Personificando");
	}
	
}
