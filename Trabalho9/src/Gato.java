package Zoo;

public class Gato extends Mamifero {
	
	public void soar() {
		// String miado
	}
	
	public Gato (String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie = "Gato";
	}
}
