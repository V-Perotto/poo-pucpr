package Sala_Da_Justica;

public abstract class Heroi extends Personagem {
		
	public Heroi(int cor) {
		super(cor);
	}
			
	public void correr(float x, float y) {
		System.out.println("Heroi correndo... ");
		this.posicaoX = x;
		this.posicaoY = y;
	}
	
	public void saltar(float z) {
		System.out.println("Heroi saltando... ");
		this.posicaoZ = z;
	}
}

