package Empresa;

public class Pagamento {
	
	public static void main(String[] args) {
		
		Concursado joao = new Concursado (4000, 5);
		Temporario pedro = new Temporario (2000, 12);
		Concursado maria = new Concursado(2400, 3);
		Temporario jose = new Temporario (1200, 10);
		
		RH rh = new RH(); // opcional
		
		rh.folha_pagamento(); // opcional
		rh.joao(); // opcional
		System.out.println("Salario Joao = R$ " + joao.salario_mensal());
		
		rh.folha_pagamento(); // opcional
		rh.pedro(); // opcional
		System.out.println("Salario Pedro = R$ " + pedro.salario_mensal());
		
		rh.folha_pagamento(); // opcional
		rh.maria(); // opcional
		System.out.println("Salario Maria = R$ " + maria.salario_mensal());
		
		rh.folha_pagamento(); // opcional
		rh.jose(); // opcional
		System.out.println("Salario Jose = R$ " + jose.salario_mensal());
		
	}

}
