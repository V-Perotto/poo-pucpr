package Zoo;

import java.io.Serializable;

public class Mamifero implements Serializable{
	
	private String nome;
	private int idade;
	private String dono;
	protected String especie;
	
	public Mamifero (String nome, int idade, String dono) {
		this.setNome(nome);
		this.setIdade(idade);
		this.dono = dono;
	}
	
	// recupera os animais salvos em arquivo e os exibe na tela
	// method toString
	public String toString() {
		
		String retorno = "";
		
		retorno += "Nome: "    + this.nome    + "\n";
		retorno += "Idade: "   + this.idade   + "\n";
		retorno += "Dono: "    + this.dono    + "\n";
		retorno += "Especie: " + this.especie + "\n";
		retorno += "Barulho: " + soar()       + "\n";
		return retorno;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void soar() {	// String
		
	}
	
 
	
	
	
}
