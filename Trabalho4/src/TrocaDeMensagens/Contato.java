package TrocaDeMensagens;
import java.util.ArrayList;

public class Contato {
	
	private String nomeContato;
	private ArrayList<Mensagem> mensagens;
	
	public Contato(String nomeContato) { // constructor
		this.nomeContato = nomeContato;
		this.mensagens = new ArrayList<Mensagem>();
	}
	
	public ArrayList<Mensagem> getMensagens() { // getter
		return this.mensagens;
	}
	
	public String getNomeContato() { // getter
		return nomeContato;
	}
	
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	public void imprimirMensagens() { // do enunciado
		for (Mensagem msg : this.mensagens) {
			System.out.println(msg.getTexto());
		}
	
	}
}
