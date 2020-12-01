package Sala_Da_Justica;

public class JamesBond extends Heroi {
	
	public JamesBond(int cor) {
		super(cor);
	}

	public void saltar(float z) {
		System.out.println("James Bond saltando...\t" + z);
		this.posicaoZ = z;
	}
	
	public void atirar() {
		System.out.println("James Bond atirando...");
	}

}
