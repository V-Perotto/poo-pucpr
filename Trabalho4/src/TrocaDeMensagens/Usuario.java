package TrocaDeMensagens;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String nomeUser;
	private ArrayList<Contato> contatos;
	private String nomeContato;
	private String msg;
	
	public Usuario(String nomeUser) {
		this.nomeUser = nomeUser;
		this.contatos = new ArrayList<Contato>();
	}	
	
	public void conversar() {
		boolean fim = false;
		int opt;
		Scanner ler = new Scanner(System.in);
		
		while (!fim) {
			System.out.println("1) Adicionar contato");
			System.out.println("2) Enviar mensagem para o contato");
			System.out.println("3) Receber mensagem do contato");
			System.out.println("4) Imprimir conversas");
			System.out.println("5) Fim");
			System.out.print("\nEscolha uma opção: ");
			opt = ler.nextInt();
			ler.nextLine();
			System.out.print("\n");
		
			switch (opt) {
				case 1:
					System.out.println("1) Adicionar contato");
					System.out.print("\n* Entre o nome do contato: ");
					
					inserirContato(this.nomeContato);
					
					System.out.println("\n-- Operação realizada com sucesso!");
					System.out.println("\nAperte qualquer tecla para continuar...");
					ler.next();
					
					break;
				
				case 2:
					System.out.println("2) Enviar mensagem para o contato");
					System.out.print("\n* Digite o nome do contato: ");
					
					this.nomeContato = ler.nextLine();
					
					System.out.print("\n* Insira a mensagem para [" + this.nomeContato + "]: ");
					this.msg = ler.nextLine();
					this.enviarMensagem(this.nomeContato, this.msg); // envio de msg contato
					
					System.out.println("\nAperte qualquer tecla para continuar...");
					ler.nextLine();
					System.out.flush();
					
					break;
				
				case 3:
					System.out.println("3) Receber mensagem do contato");
					
					System.out.print("\n* Digite o nome do contato: ");
					this.nomeContato = ler.nextLine();
					System.out.print("\nMensagem de: [" + this.nomeContato + "]: ");
					this.msg = ler.nextLine();
					this.receberMensagem(this.nomeContato, this.msg);
					
					System.out.println("\nAperte qualquer tecla para continuar...");
					ler.nextLine();
					System.out.flush();
					break;
				
				case 4:
					System.out.println("4) Imprimir conversas");
					
					System.out.print("\n*** Conversas de [" + this.nomeUser + "] ***\n");
					// Percorre contatos e invoca a operação de imprimirMensagens();
					for (Contato c : this.contatos) {
						// Exibe o nome do contato e o total de msgs trocadas com o usuario
						System.out.println("\n--- Contato [" + c.getNomeContato() + "] tem [" + c.getMensagens().size() + "] mensagens.");
						c.imprimirMensagens();
					}
					
					System.out.println("\nAperte qualquer tecla para continuar...");
					ler.nextLine();
					System.out.flush();
					
					break;
				
				case 5:
					
					System.out.println("5) Fim");
					fim = true;
					ler.close();
					System.out.println("\nPROGRAMA ENCERRADO.");
					
					break;
				
				default:
					System.out.print("Opção Incorreta. Tente novamente.");
					System.out.println("\n-- Operação realizada com sucesso!");
					System.out.println("\nAperte qualquer tecla para continuar...");
					
					break;
			}
			this.cls();
		}
		
		
	}
	
	public void cls() {
		// simula clear screen
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}

	
	public void inserirContato(String nomeContato) {
		Scanner ler = new Scanner(System.in);
		this.nomeContato = nomeContato;
		
		nomeContato = ler.next();
		this.contatos.add(new Contato(nomeContato));
	}
	
	//----------------------------------------------
	// Método: 	enviarMensagem
	// Entrada: nome que envia msg
	//			msg a ser enviada
	// Saida: 	vazia.
	//----------------------------------------------
	public void enviarMensagem(String entrada, String msg) {
		Contato contato = this.encontraContato(nomeContato);
		
		if (contato != null ) {
			contato.getMensagens().add(new Mensagem("[ENVIAR]" + msg));
			System.out.println("\n-- Operação realizada com sucesso!");
		}
		
		else {
			System.out.println("Contato [" + nomeContato + "] inexistente.");
		}
		
	}
	
	public void receberMensagem(String entrada, String msg) {
		Contato contato = this.encontraContato(nomeContato);
		
		if (contato != null ) {
			contato.getMensagens().add(new Mensagem("[RECEBER]" + msg));
			System.out.println("\n-- Operação realizada com sucesso!");
		}
		
		else {
			System.out.println("Contato [" + nomeContato + "] inexistente.");
		}
		
	}
	
	private Contato encontraContato(String nome) {
		for (Contato c : this.contatos) {
			if (c.getNomeContato().equals(nome)) { // Testa se String nome = Contato.nome
				return c; // Encontrou o nome nos contatos, e já retorna o obj
			}
		}
		return null; // Terminou de varrer contatos e não encontrou o nome
	}

	public static void main (String[] args) {
		Usuario user1 = new Usuario("Jose");
		user1.conversar();
	}
}
