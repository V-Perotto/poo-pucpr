package Sala_Da_Justica;

public abstract class Ladrao extends Vilao {

	public Ladrao(int cor) {
		super(cor);
	}

	public void saltar(float z) {
		System.out.println("Ladr�o saltando...\t" + z);
		this.posicaoZ = z;
	}
	
	public void atirar() {
		System.out.println("Ladr�o atirando...");
	}
}
