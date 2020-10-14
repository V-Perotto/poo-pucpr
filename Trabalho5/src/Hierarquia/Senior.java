package Hierarquia;

public class Senior extends Profissional {
	
	private double premio;
	
	public Senior(String nome, int score, double capital, double premio) {
		super(nome, score, capital); // chama construtor da super classe
		this.premio = premio;
	}
	
	public void ganhar(int p) {
		super.ganhar(p);
		this.premio += (premio * 2);
	}
	
	public void perder(int p) {
		super.perder(p);
		this.premio -= (premio / 2);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Premio: " + premio);
	}
}
