package LojaEletro;

@SuppressWarnings("serial")
public class Laptop extends Eletronicos {
	
	private String tipoLaptop;
	
	public Laptop (String idEletro, String nomeEletro, String infoEletro, String tamanhoTela, String tipoLaptop) {
		super(idEletro, nomeEletro, infoEletro, tamanhoTela);
		this.tipoLaptop = tipoLaptop;
	}

	public String getTipoLaptop() {
		return tipoLaptop;
	}

	public void setTipoLaptop(String tipoLaptop) {
		this.tipoLaptop = tipoLaptop;
	}
	
	public String toString() {
		return super.toString() +
				"Tipo de Laptop: " + this.getTipoLaptop();
	}
}
