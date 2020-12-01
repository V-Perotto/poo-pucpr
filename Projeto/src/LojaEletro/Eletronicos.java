package LojaEletro;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Eletronicos implements Serializable {
	private String idEletro;
	private String nomeEletro;
	private String infoEletro;
	private String tamanhoTela;
	
	public Eletronicos (String idEletro, String nomeEletro, String infoEletro, String tamanhoTela) {
		this.idEletro = idEletro;
		this.nomeEletro = nomeEletro;
		this.infoEletro = infoEletro;
		this.tamanhoTela = tamanhoTela;		
	}

	public String getIdEletro() {
		return idEletro;
	}

	public void setIdEletro(String idEletro) {
		this.idEletro = idEletro;
	}

	public String getNomeEletro() {
		return nomeEletro;
	}

	public void setNomeEletro(String nomeEletro) {
		this.nomeEletro = nomeEletro;
	}

	public String getInfoEletro() {
		return infoEletro;
	}

	public void setInfoEletro(String infoEletro) {
		this.infoEletro = infoEletro;
	}

	public String getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(String tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	
	public String toString() {
		String retorno;
		retorno = "----------------------------" + "\n" +
				"ID Eletrônico: " + this.getIdEletro() + "\n" +
				"Nome do Eletrônico: " + this.getNomeEletro() + "\n" +
				"Informaçãoes sobre o Eletrônico: " + this.getInfoEletro() + "\n" +
				"Tamanho da Tela: " + this.getTamanhoTela() + "\n";
		return retorno;
	}	
}