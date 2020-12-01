package Computador;

//import java.util.ArrayList;

public class Arquivo {
	
	protected String nome;
	protected int endereco;
	protected int blocos;
	//private ArrayList<Arquivo> arquivos;
	
	public Arquivo (String n, int e, int b) {
		this.nome = n;
		this.endereco = e;
		this.blocos = b;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void imprimirNome() {
		System.out.println("\t. " + nome);
	}
	
	public void abrir() {
		System.out.println(this.nome);
	}
	
	/*
	 * public void replica(Arquivo arq) { // ... fazer uma copia de variavel ou
	 * duplicar?
	 * 
	 * if (arq != null) { Arquivo arqDuplicado = new Arquivo(arq.nome + " (copia)",
	 * arq.endereco, arq.blocos); arquivos.add(arqDuplicado); }
	 * 
	 * else { System.out.println("Arquivo [" + arq + "] inexistente"); } }
	 */
}
