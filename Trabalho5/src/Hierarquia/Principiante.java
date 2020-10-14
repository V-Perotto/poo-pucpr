package Hierarquia;

public class Principiante extends Jogador {
	
	private double bonus;
	
	// puxa os atributos da classe Jogador
	public Principiante(String nome, int score, double bonus) {
		super(nome, score);
		this.bonus = bonus;
	}
		
	public void ganhar(int p) {
		score += p;
		this.bonus += (p * 0.1);
	}
	
	public void perder(int p) {
		score -= p;
		this.bonus -= (p * 0.1);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Bonus: " + bonus);
	}
}
