package ColecaoDeSelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao {

	private ArrayList<Selo> meusSelos;
	private ArrayList<Moeda> minhasMoedas;	
	
	public Colecao() {
		this.meusSelos = new ArrayList<Selo>();
		this.minhasMoedas = new ArrayList<Moeda>();
	}
	
	private void totalMoedas() {
		System.out.println("Total de moedas: " + this.minhasMoedas.size());
	}

	private void totalSelos() {
		System.out.println("Total de selos: " + this.meusSelos.size());
	}
	
	public void menu() {
		Scanner ler = new Scanner(System.in);
		boolean fim = false;
		int opt, ano;
		String entrada;
		double valor;
		
		while(!fim) {
			System.out.println("------------------");
			System.out.println("\tMenu\t");
			System.out.println("------------------");
			System.out.println("1) Adicionar Selo");
			System.out.println("2) Ver a Colecao");
			System.out.println("3) Total de Selos");
			System.out.println("4) Fim");
			
			opt = ler.nextInt();
			switch (opt) {
				case 1:
					System.out.print("Coloque o nome do selo: ");
					entrada = ler.next();
					
					System.out.print("Coloque o ano do selo: ");
					ano = ler.nextInt();
					
					System.out.print("Coloque o valor do selo: ");
					valor = ler.nextDouble();
					
					this.meusSelos.add(new Selo(entrada, ano, valor));
					System.out.println("-- operacao realizada com sucesso!");
					
					break;
				
				case 2:
					for (Selo selo : this.meusSelos) { 
						selo.imprimirSelo(); 
					}
					
					System.out.println("-- operacao realizada com sucesso!");
					
					break;
				
				case 3:
					System.out.println("Total de Selos: " + this.meusSelos.size());
					System.out.println("-- operacao realizada com sucesso!");
					break;
				
				case 4:
					fim = true;
					System.out.println("-- programa encerrado com sucesso!");
					break;
				
				default:
					System.out.println("\nOPCAO INVALIDA");
			}
		}
	}
	
	public static void main(String[] args) {
		Colecao minhaColecao = new Colecao();
		
		minhaColecao.menu();
		
		/*
		 * minhaColecao.meusSelos.add(new Selo("Indenpendencia", 2015, 0.75));
		 * minhaColecao.meusSelos.add(new Selo("Finados", 2000, 0.25));
		 * minhaColecao.meusSelos.add(new Selo("Carnaval", 2010, 1.75));
		 * 
		 * minhaColecao.minhasMoedas.add(new Moeda("1 Real", 1990, 1.0, "Cobre"));
		 * minhaColecao.minhasMoedas.add(new Moeda("25 Cents", 2000, 0.25, "Latao"));
		 * minhaColecao.minhasMoedas.add(new Moeda("50 Cents", 2010, 0.50, "Latao"));
		 * 
		 * System.out.println("\nCOLECAO DE SELOS\n"); for (Selo selo :
		 * minhaColecao.meusSelos) { selo.imprimirSelo(); } minhaColecao.totalSelos();
		 * 
		 * System.out.println("\nCOLECAO DE MOEDAS\n"); for (Moeda moeda :
		 * minhaColecao.minhasMoedas) { moeda.imprimirMoeda(); }
		 * minhaColecao.totalMoedas();
		 */
	}

}
