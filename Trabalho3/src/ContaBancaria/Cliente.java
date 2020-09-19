package ContaBancaria;

public class Cliente {
	
	private String nome;
	private ContaCorrente contaCorrente; // Classe -> atributo
	
	public Cliente (String nome, int numero) {
		this.nome = nome; // this: trabalhar com obj, diferenciar atributo -> metodo
		this.contaCorrente = new ContaCorrente(numero);
		this.contaCorrente.setCliente(this);	
		this.contaCorrente.setSaldo(0);
	}
	
	public void operar() {
				
		this.contaCorrente.depositar();	
		this.contaCorrente.retirar();
		this.contaCorrente.imprimir();
		this.contaCorrente.verificar();
		
	}

	public String getNome() {
		return nome;
	}	

}
