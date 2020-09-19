package Especialista;

import Matematica.*;

class EngenheiroCivil {
	
	private static String nome = "Ricardo Zaro";
	private static int idade = 24;
	
	private static void exibir_dados_pessoais() 
	{
		System.out.println(nome);
		System.out.println(idade + " anos");
	}
	
	public static void main(String[] args) 
	{
		exibir_dados_pessoais();
		
		Retangulo.definirLados(4.7f, 8.2f);
		System.out.println("Tamanho dos lados: " + Retangulo.getLadoH() + " e " + Retangulo.getLadoV());
		System.out.println("Area = " + Retangulo.area());
		System.out.println("Perimetro = " + Retangulo.perimetro());
	}
	
}