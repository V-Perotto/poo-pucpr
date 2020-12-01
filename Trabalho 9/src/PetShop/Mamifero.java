package PetShop;

import java.io.Serializable;

public abstract class Mamifero implements Serializable {

    protected String especie;
    private String nome;
    private int idade;
    private String dono;

    public Mamifero(String nome, int idade, String dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    public String toString(){
        String rtn = "";
        rtn += "Nome: "    + this.nome    + "\n";
        rtn += "Idade: "   + this.idade   + " anos\n";
        rtn += "Dono: "    + this.dono    + "\n";
        rtn += "Especie: " + this.especie + "\n";
        rtn += "Barulho: " + soar()       + "\n";
        return rtn;
    }
    
    public abstract String soar();

}
