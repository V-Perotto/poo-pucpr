package LojaEletro;

@SuppressWarnings("serial")
public class Celulares extends Eletronicos {
	
	private String qtdeChip;

	public Celulares (String idEletro, String nomeEletro, String infoEletro, String tamanhoTela, String qtdeChip) {
		super(idEletro, nomeEletro, infoEletro, tamanhoTela);
		this.qtdeChip = qtdeChip;
	}

	public String getQtdeChip() {
		return qtdeChip;
	}

	public void setQtdeChip(String qtdeChip) {
		this.qtdeChip = qtdeChip;
	}
	
	public String toString() {
		return super.toString() +
				"Quantidade de chip: " + this.getQtdeChip();
	}
}
