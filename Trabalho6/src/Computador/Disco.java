package Computador;

import java.util.ArrayList;

public class Disco {
	
	private char nome;
	private ArrayList<Pasta> pastas;
	private ArrayList<Compactado> compactados;
	
	public Disco(char n) {
		this.nome = n;
		pastas = new ArrayList<Pasta>();
		compactados = new ArrayList<Compactado>();
	}
	
	// Pasta
	public Pasta criarPasta(String nome) {
		Pasta p = new Pasta(nome);
		pastas.add(p);
		return p;
	}
	
	public void removerPasta(String nomePasta) {
		Pasta p = encontraPasta(nomePasta);
		if (p != null) 
			pastas.remove(p);
		else
			System.out.println("Pasta [" + nomePasta + "] inexistente");
	}
	
	private Pasta encontraPasta(String nomePasta) {
		Pasta pasta = null;
		for (Pasta p : pastas) {
			if (p.getNome().equals(nomePasta))
				pasta = p;
		}
		return pasta;
	}
	
	public void listarPasta() {
		System.out.println("- Disco [" + nome + ":\\] ");
		for (Pasta p : pastas) {
			p.listar();
		}
	}
	
	// Compactado
	public Compactado criarCompactada(String nome, int endereco, int bloco) {
		Compactado k = new Compactado(nome, endereco, bloco);
		compactados.add(k);
		return k;
	}
	
	public void removerCompactado(String nomeCompactado) {
		Compactado k = encontraCompactado(nomeCompactado);
		if (k != null) 
			compactados.remove(k);
		else
			System.out.println("Arquivo compactado [" + nomeCompactado + "] inexistente");
	}
	
	private Compactado encontraCompactado(String nomeCompactado) {
		Compactado compactado = null;
		for (Compactado k : compactados) {
			if (k.getNome().equals(nomeCompactado))
				compactado = k;
		}
		return compactado;
	}
	
	public void listarCompactado() {
		System.out.println("- Disco [" + nome + ":\\] ");
		for (Compactado k : compactados) {
			k.listar(null);
		}
	}
	
}
