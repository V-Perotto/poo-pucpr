package PetShop;

import java.io.*;
import java.util.ArrayList;

public class PetStore {

    private ArrayList<Mamifero> mamiferos;

    public PetStore() {
        this.mamiferos =  new ArrayList<Mamifero>();
    }

    public void adicionaAnimal (Mamifero mani){
        mamiferos.add(mani);

    }

    public void listarAnimais(){
        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero.toString());
        }
        System.out.println("Total = " + mamiferos.size() + " animais listados com sucesso\n");
    }

    public void excluirAnimal(Mamifero mani){
        if(this.mamiferos.contains(mani)){
            this.mamiferos.remove(mani);
            System.out.println("[Animal " + mani.toString() + "excluído com sucesso!]\n");
        }
        else
            System.out.println("Animal inexistente!\n");
    }

    public void excluirAnimais(){
        mamiferos.clear();
        System.out.println("Animais excluídos com sucesso!\n");
    }

    public void gravarAnimais(){
        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream (new FileOutputStream("animais.dat"));
            for(Mamifero mani:mamiferos){
                outputStream.writeObject(mani);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (outputStream != null){
                    outputStream.flush();
                    outputStream.close();
                }

            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

    public void recuperarAnimais(){
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream("animais.dat"));

            Object obj = null;

            while ((obj = inputStream.readObject()) != null) {

                if(obj instanceof Gato)
                    this.mamiferos.add((Gato) obj);
                else if(obj instanceof Cao)
                    this.mamiferos.add((Cao)obj);
            }

        }

        catch (EOFException ex) {
            System.out.println("Fim do arquivo alcançado!\n");
        }

        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                if(inputStream != null) {
                    inputStream.close();
                    System.out.println("Animais recuperados com sucesso!");
                }
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        PetStore pet = new PetStore();

        Gato felix = new Gato("Felix", 3,"Maria");
        Gato garfield = new Gato("Garfield", 7,"Maria");
        Cao rex = new Cao("Rex", 2, "Jose");
        Cao toto = new Cao("Toto", 5, "Jose");

        pet.adicionaAnimal(felix);
        pet.adicionaAnimal(garfield);
        pet.adicionaAnimal(rex);
        pet.adicionaAnimal(toto);

        pet.listarAnimais();
        pet.gravarAnimais();
        pet.excluirAnimal(garfield);

        pet.listarAnimais();
        pet.excluirAnimais();

        pet.listarAnimais();
        pet.recuperarAnimais();

        pet.listarAnimais();

    }
}