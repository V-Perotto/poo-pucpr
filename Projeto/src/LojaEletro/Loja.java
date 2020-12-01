package LojaEletro;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Loja {
	
	public String[] leValores(String[] dadosIn) {
		String [] dadosOut = new String [dadosIn.length];
		for (int i = 0; i < dadosIn.length; i++)
			dadosOut[i] = JOptionPane.showInputDialog("Entre com " + dadosIn[i] + ": ");
		return dadosOut;
	}
	
	public Celulares lerCelulares() {
		String [] valores = new String [5];
		String [] nomeVal = {"ID do Eletro", "Marca e Modelo", "Características", "Tamanho da Tela", "Quatidade de chip"};
		valores = leValores(nomeVal);
		Celulares prodCel = new Celulares (valores[0], valores[1], valores[2], valores[3], valores[4]);
		return prodCel;
	}
	
	public Laptop lerLaptop() {
		String [] valores = new String [5];
		String [] nomeVal = {"ID do Eletro", "Marca e Modelo", "Processador e Memória", "Tamanho da Tela", "Outras informações"};
		valores = leValores(nomeVal);
		Laptop prodLap = new Laptop (valores[0], valores[1], valores[2], valores[3], valores[4]);
		return prodLap;
	}
	
	public SmartWacth lerSmartWacth() {
		String [] valores = new String [4];
		String [] nomeVal = {"ID do Eletro", "Marca e Modelo", "Informações", "Tela", "Cor da Pulseira"};
		valores = leValores(nomeVal);
		SmartWacth prodWacth = new SmartWacth (valores[0], valores[1], valores[2], valores[3], valores[4]);
		return prodWacth;
	}
	
	public void mostrarEletro(String dados) {
		JOptionPane.showInternalMessageDialog(null, "Eletrônicos \n --------- \n " + dados);
	}
	
	public void salvarEletro(ArrayList<Eletronicos> eletronicos) {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream
					(new FileOutputStream("C:\\Users\\user\\Desktop\\LojaEletros.dat"));
			for (int i=0; i < eletronicos.size(); i++)
				outputStream.writeObject(eletronicos.get(i));
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null,"Impossível criar arquivo!");
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {  //Close the ObjectOutputStream
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("finally")
	public ArrayList<Eletronicos> recuperarEletronicos() {
		ArrayList<Eletronicos> eletros = new ArrayList<Eletronicos>();
		ObjectInputStream inputStream = null;
		try {	
			inputStream = new ObjectInputStream
					(new FileInputStream("c:\\temp\\superMercado.dad"));
			Object obj = null;
			while ((obj = inputStream.readObject()) != null) {
				if (obj instanceof Eletronicos) {
					eletros.add((Eletronicos) obj);
				}   
			}          
		} catch (EOFException ex) { // when EOF is reached
			System.out.println("End of file reached.");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null,"Arquivo com produtos NÃO existe!");
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {  //Close the ObjectInputStream
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
			return eletros;
		}
	}
	
	@SuppressWarnings("deprecation")
	public void menuEletro() {
		ArrayList<Eletronicos> eletronicos = new ArrayList<Eletronicos>();
		String menu = "";
		String entrada;
		int opc1, opc2;
		do {
			menu =  "Loja de Eletronicos\n" +
					"------------------------\n" +
					"Opções:\n" +
					"------------------------\n" +
					"1. Entrar Eletronicos\n" +
					"2. Exibir Eletronicos\n" +
					"3. Limpar Eletronicos\n" +
					"4. Gravar Eletronicos\n" +
					"5. Recuperar Eletronicos\n" +
					"9. Sair";
			entrada = JOptionPane.showInputDialog (menu + "\n\n");
			while (!numeroInteiroValido(entrada)) {
	            entrada = JOptionPane.showInputDialog(null, menu + 
	                    "\n\nEntrada inválida! Digite um número inteiro.");
	        }
			opc1 = new Integer(entrada);
			switch (opc1) {
			case 1:// Entrar dados
				menu =  "Entrada de Eletronicos\n" +
						"------------------------\n" +
						"Opções:\n" +
						"------------------------\n" +
						"1. Celulares\n" +
						"2. Laptop\n" +
						"3. SmartWacth\n";

				entrada = JOptionPane.showInputDialog (menu + "\n\n");
				while (!numeroInteiroValido(entrada)) {
		            entrada = JOptionPane.showInputDialog(null, menu + 
		                    "\n\nEntrada inválida! Digite um número inteiro.");
		        }
				opc2 = new Integer(entrada);

				switch (opc2){
				case 1: eletronicos.add((Eletronicos)lerCelulares());
				break;
				case 2: eletronicos.add((Eletronicos)lerLaptop());
				break;
				case 3: eletronicos.add((Eletronicos)lerSmartWacth());
				break;
				default: 
					JOptionPane.showMessageDialog(null,"Eletronicos para entrada NÃO escolhido!");
				}

				break;
				
			case 2: // Exibir dados
				if (eletronicos.size() == 0) {
					JOptionPane.showMessageDialog(null,"Entre com produtos primeiramente");
					break;
				}
				String dados = "";
				for (int i=0; i < eletronicos.size(); i++)	{
					dados += eletronicos.get(i).toString() + "\n";
				}
				JOptionPane.showMessageDialog(null,dados);
				break;
				
			case 3: // Limpar Dados
				if (eletronicos.size() == 0) {
					JOptionPane.showMessageDialog(null,"Escolha um dos nossos eletrônicos!");
					break;
				}
				eletronicos.clear();
				JOptionPane.showMessageDialog(null,"DADOS LIMPOS COM SUCESSO!");
				break;
				
			case 4: // Grava Dados
				if (eletronicos.size() == 0) {
					JOptionPane.showMessageDialog(null,"ENTRE COM O ELETRÔNICO QUE DESEJA!");
					break;
				}
				salvarEletro(eletronicos);
				JOptionPane.showMessageDialog(null,"Dados SALVOS com sucesso!");
				break;
				
			case 5: // Recupera Dados
				eletronicos = recuperarEletronicos();
				if (eletronicos.size() == 0) {
					JOptionPane.showMessageDialog(null,"NÃO EXISTEM DADOS!");
					break;
				}
				JOptionPane.showMessageDialog(null,"DADOS RECUPERADOS COM SUCESSO!");
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null,"Até a próxima!");
				break;
			}
		} while (opc1 != 9);
	}
	
	private boolean numeroInteiroValido(String l) {
		boolean resultado;
		try {
			Integer.parseInt(l);
			resultado = true;
		} catch (NumberFormatException e) {
			resultado = false;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Loja shop = new Loja();
		shop.menuEletro();		
	}
	
}
