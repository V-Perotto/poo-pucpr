package ColecaoDeSelo;

public class Selo {
	
	private String nome;
	private int ano;
	private double valor;
	
	public Selo(String nome, int ano, double valor) {
		this.ano = ano;
		this.nome = nome;
		this.valor = valor;
		
	}
	
	public void imprimirSelo() {
		System.out.println("Nome selo: " + this.nome);
		System.out.println("Ano do selo: " + this.ano);
		System.out.println("Valor do selo: R$ " + this.valor);
		
	}
	
}
