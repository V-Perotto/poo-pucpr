package sistemaBanco;

import exception.sistemaBanco.*;

public class ContaCorrente {

	private int numero;
	private String senha;
	private double saldo;
	
	public ContaCorrente(int numero, String senha, double saldo) {
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: [Numero: " + numero + ", Senha: " + senha + ", Saldo: " + saldo + " ]";
	}
	
	public void retirar(int numero, String senha, double valor, int horas) 
			throws ExcecaoContaInvalida, 
				   ExcecaoSenhaInvalida,
			   	   ExcecaoHorarioInvalido, 
			   	   ExcecaoSaldoInsuficiente
	{
		if (numero != this.numero)
			throw new ExcecaoContaInvalida ("ERRO: Conta Inválida!");
		if (!this.senha.equals(senha))
			throw new ExcecaoSenhaInvalida ("ERRO: Senha Inválida!");
		if (this.saldo < valor)
			throw new ExcecaoSaldoInsuficiente ("ERRO: Saldo Insuficiente!");
		if (horas < 8 || horas > 22)
			throw new ExcecaoHorarioInvalido ("ERRO: Horário Inválido!");
		
		this.saldo -= valor;
	}
}
