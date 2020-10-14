package mercadinho;

import java.util.ArrayList;

public class Mercado {
	
	private String nome;
	private ArrayList<Alimento> alimentos;
	private ArrayList<Utilidade> utilidades;
	
	public Mercado(String nome) {
		this.nome = "Condor";
		
		this.alimentos = new ArrayList<Alimento>();
		this.utilidades = new ArrayList<Utilidade>();
			
		System.out.println("*** Mercado: " + this.nome + " ***\n");
	}
	
	public double totalValorAlimentos() {
		
		double aux = 0;
        for (Alimento alimento : this.alimentos) {
            aux += alimento.getPreco() * alimento.getQuantidade();
        }
        return aux;
	
	}
	
	/*
	 * public double menorValorAlimentos() {
	 * 
	 * double aux, aux1; aux
	 * 
	 * for (Utilidade utilidade : this.utilidades) { aux =
	 * utilidade.getQuantidade(); } return aux; }
	 */
	
	public double totalValorUtilidades() {
		
		double aux = 0;
        for (Utilidade utilidade : this.utilidades) {
            aux += utilidade.getPreco() * utilidade.getQuantidade();
        }
        return aux;
	}
	
	/*
	 * public double menorValorUtilidades() {
	 * 
	 * double aux = 0; for (Utilidade utilidade : this.utilidades) { aux +=
	 * utilidade.getQuantidade(); } return aux; }
	 */
	
	public static void main(String[] args) {
			
		Mercado mercado = new Mercado("Condor");
		
		mercado.alimentos.add(new Alimento("KitKat Dark", "Nestle", "Chocolate", 2.55, 530));
		mercado.alimentos.add(new Alimento("Iogurte Natural", "Nestle", "Laticinio", 2.25, 500));
		mercado.alimentos.add(new Alimento("Batata Frita", "Elma Chips", "Snacks", 4.35, 200));
		mercado.alimentos.add(new Alimento("Leite Fermentado", "Batavo", "Laticinio", 1.00, 620));
		mercado.alimentos.add(new Alimento("Ovo de Pascoa", "Lacta", "Chocolate", 35.00, 410));
		
		mercado.utilidades.add(new Utilidade("Copo Americano", "Copo", "Nadir Figueredo", 2.50, 250));
		mercado.utilidades.add(new Utilidade("Bule Termico", "Garrafa Termica", "Sanremo", 45.00, 20));
		mercado.utilidades.add(new Utilidade("Colher de Aço", "Colher", "Tramontina", 5.25, 565));		
				
		System.out.println("\nAlimentos");
		System.out.println("-----------------");
		//System.out.println("Menor valor: R$ " + mercado.menorValorAlimentos());
		System.out.println("Valor total: R$ " + mercado.totalValorAlimentos());
		
		mercado.totalValorAlimentos();
		for (Alimento alimento : mercado.alimentos) { 
			alimento.imprimirAlimento(); 
		}		
		
		System.out.println("\nUtilidade domesticas");
		System.out.println("-----------------");
		//System.out.println("Menor valor: R$ " + mercado.menorValorUtilidades());
		System.out.println("Valor total: R$ " + mercado.totalValorUtilidades());
		
		mercado.totalValorUtilidades();
		for (Utilidade utilidade : mercado.utilidades) {
			utilidade.imprimirUtilidade();
		}
		
	}

}
