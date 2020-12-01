package Zoo;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PetStore {
	
	private ArrayList<Mamifero> mamiferos;
	
	// method constructor
	public PetStore() {
		mamiferos = new ArrayList<Mamifero>();
	}
	
	// method ADICIONAR ANIMAL
	public void adicionaAnimal(Mamifero mani) {
		mamiferos.add(mani);
	}
	
	// method LISTAR ANIMAIS
	public void listarAniamis() {
		System.out.println("");
		for(Mamifero mani : mamiferos) {
			// mani.listarAnimais();
		}
	}
	
	// method EXCLUIR ANIMAL
	public void excluirAnimal(Mamifero mani) {
		
		if(this.mamiferos.contains(mani)) {
			this.mamiferos.remove(mani);
			System.out.println("XXXXXXXX\n");
		} else
			System.out.println("Animal inexistente!\n");
	}
	
	// method EXCLUIR ANIMAIS
	public void excluirAnimais() {
		mamiferos.clear();
		System.out.println("XXXXXXXX\n");
	}
	
	// para GRAVAR animais (objetos) 
	public void gravarAnimais() {
		
		ObjectOutputStream outputStream = null;
		
		try {
			outputStream = new ObjectOutputStream (new FileOutputStream("C:\\Users\\julia\\Desktop_Juliane\\animais.dat"));
			for(Mamifero mani:mamiferos) {
				outputStream.writeObject(mani);
			}
		}
		
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		finally {
			try {
				if (outputStream != null) {
					// XXXXX
				}
			}
			catch (IOException ex) {
				System.out.println("XXXXXX");
			}
		}
	}
	
	// para RECUPERAR animais (objeto)
	public void recuperarAnimais() {
		
		ObjectInputStream inputStream = null;
		
		try {
			inputStream = new ObjetctInputStream(new FileInputStream("C:\\Users\\julia\\Desktop_Juliane\\animais.dat"));
			
			obj = inputStream.readObject();
			
			while ((obj = inputStream.readObject()) != null) {
				
				if(obj instanceof Gato)
					this.mamiferos.add(obj);
				else if(obj instanceof Cao)
					this.mamiferos.add(obj);
			}
			
		}
		
		catch (EOFException ex) {
			System.out.println("XXXXXX");
		}
		
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} 
		
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		finally {
			try {
				if(inputStream != null) {
					// XXXXX
					System.out.println("XXXXXX");
				}
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		PetStore pet = new PetStore();
				
		pet.adicionaAnimal(felix);
		pet.adicionaAnimal(garfield);
		pet.adicionaAnimal(rex);
		pet.adicionaAnimal(toto);
		
		pet.listarAniamis();
		pet.gravarAnimais();
		pet.excluirAnimal(garfield);
		
		pet.listarAniamis();
		pet.gravarAnimais();
		pet.excluirAnimais();
		
		pet.listarAniamis();
		pet.recuperarAnimais();
		
		pet.listarAniamis();	
		
	}

	public ArrayList<Mamifero> getMamiferos() {
		return mamiferos;
	}

	public void setMamiferos(ArrayList<Mamifero> mamiferos) {
		this.mamiferos = mamiferos;
	}
		
		
	
}
