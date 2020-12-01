package PetShop;

public class Gato extends Mamifero {

    public String soar(){
        return "Miau";
    }

    public Gato(String nome, int idade, String dono) {
        super(nome, idade, dono);
        this.especie = "Gato";
    }

}
