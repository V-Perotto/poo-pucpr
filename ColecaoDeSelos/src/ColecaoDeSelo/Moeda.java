package ColecaoDeSelo;

public class Moeda {
	
	private String nome;
	private int ano;
	private double valor;
	private String material;
	
	public Moeda (String nome, int ano, double valor, String material) {
		this.ano = ano;
		this.nome = nome;
		this.valor = valor;
		this.material = material;
		
	}
	
	public void imprimirMoeda() {
		System.out.println("Nome da moeda: " + this.nome);
		System.out.println("Ano da moeda: " + this.ano);
		System.out.println("Valor da moeda: R$ " + this.valor);
		System.out.println("Material da moeda: " + this.material);
	}

}
