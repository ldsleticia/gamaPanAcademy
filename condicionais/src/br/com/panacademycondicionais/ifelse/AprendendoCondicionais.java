package br.com.panacademycondicionais.ifelse;

public class AprendendoCondicionais {
    public static void main(String[] args) {
        int idade;
        int pessoas;

        idade = 15;
        pessoas = 4;
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            if (pessoas >= 3) {
                System.out.println("Você pode entrar");
            } else {
                System.out.println("Você é menor de idade");
            }
        }
    }
}
