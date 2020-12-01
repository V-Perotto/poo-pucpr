package LojaEletro;

@SuppressWarnings("serial")
public class SmartWacth extends Eletronicos {
	
	private String tipoPulseira;
	
	public SmartWacth (String idEletro, String nomeEletro, String infoEletro, String tamanhoTela, String tipoPulseira) {
		super(idEletro, nomeEletro, infoEletro, tamanhoTela);
		this.tipoPulseira = tipoPulseira;
	}

	public String getTipoPulseira() {
		return tipoPulseira;
	}

	public void setTipoPulseira(String tipoPulseira) {
		this.tipoPulseira = tipoPulseira;
	}
	
	public String toString() {
		return super.toString() +
				"Tipo de pulseira: " + this.getTipoPulseira();
	}
}
