package Sala_Da_Justica;

public abstract class Terrorista extends Vilao {

	public Terrorista(int cor) {
		super(cor);
	}

	public void atirar() {
		System.out.println("Terrorista atirando...");
	}
	
	public void saltar(float z) {
		System.out.println("Terrorista saltando...");
		this.posicaoZ = z;
	}
}
