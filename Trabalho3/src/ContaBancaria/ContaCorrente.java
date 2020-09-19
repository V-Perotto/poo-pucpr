package ContaBancaria;
import java.util.Scanner;

public class ContaCorrente {
	
	private int numero;
	private double saldo;
	private double saque;
	private Cliente cliente;

	public ContaCorrente(int Numero) {
		this.numero = Numero;
	}

	// faz atribuição
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nCliente: " + this.cliente.getNome());
		System.out.println("Entre o valor de deposito: ");
		this.saldo = ler.nextDouble();
	}
	
	public double retirar() {
		// assert - saldo não pode ser negativo
		
		assert this.saldo > saque;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre o valor de saque: ");
		saque = ler.nextDouble();
		
		return saque;
	}
	
	public double verificar() {
		// retornar saldo atual da conta
		
		this.saldo = this.saldo - this.saque;
		assert this.saldo > 0 : "ERRO: A conta não pode estar negativa";
		System.out.println("Valor sacado: " + this.saldo);
		
		return this.saldo ;
	}
	
	public void imprimir() {
		System.out.println("Dados da Conta Corrente");
		System.out.println("================================");
		System.out.println("Nome do Cliente: " + this.cliente.getNome());
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Saldo na Conta: " + this.saldo);
		System.out.println("================================");
	}
	
}
