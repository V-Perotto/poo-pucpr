package mercadinho;

public class Utilidade {
	
	private String nome;
	private String tipo;
	private String marca;
	private double preco;
	private int quantidade;
	
	public Utilidade(String nome, String tipo, String marca, double preco, int quantidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void imprimirUtilidade() {
			
		System.out.println("Nome do Livro: \t" + this.nome);
		System.out.println(" - Marca: \t" + this.marca);
		System.out.println(" - Categoria: \t" + this.tipo);
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
