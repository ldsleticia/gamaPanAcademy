package br.com.heranca;

public class Mamifero extends Animal {
    public boolean consomeLeite;

    public String isMamifero() {
        if (this.consomeLeite)
            return "Eh mamifero";
        else
            return "Nao eh mamifero";
    }

}
