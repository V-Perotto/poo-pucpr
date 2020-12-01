package PetShop;

public class Cao extends Mamifero {

    public String soar(){
        return "Au au";
    }

    public Cao(String nome, int idade, String dono) {
        super(nome, idade, dono);
        this.especie = "Cao";
    }

}
