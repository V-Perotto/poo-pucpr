package mercadinho;

public class Alimento {

	private String nome;
	private String categoria;
	private String marca;
	private double preco;
	private int quantidade;
	
	public Alimento(String nome, String tipo, String marca, double preco, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.categoria = tipo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void imprimirAlimento() {
		
		System.out.println("Nome do Livro: \t" + this.nome);
		System.out.println(" - Marca: \t" + this.marca);
		System.out.println(" - Categoria: \t" + this.categoria);
		System.out.println(" - Preco: \t" + this.preco);
		System.out.println(" - Quantidade: \t" + this.quantidade);
		
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
