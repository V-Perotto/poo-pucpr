package ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		Cliente maria = new Cliente("Maria", 123);
		Cliente jose = new Cliente("Jose", 456);
		Cliente joao = new Cliente("Joao", 789);
		
		maria.operar();
		joao.operar();
		jose.operar();
	}

}
