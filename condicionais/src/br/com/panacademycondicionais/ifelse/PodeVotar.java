package br.com.panacademycondicionais.ifelse;

import java.time.LocalDate;

public class PodeVotar {
    public static void main(String[] args) {
        int anoDeNascimento;
        int anoAtual;
        int idade;

        anoDeNascimento = 2005;
        anoAtual = LocalDate.now().getYear();
        idade = anoAtual - anoDeNascimento;

        if (idade == 16 || idade == 17 || idade >= 70) {
            System.out.println("Seu voto é facultativo");
        } else if (idade >= 18) {
            System.out.println("Seu voto é obrigatório");
        } else {
            System.out.println("Não pode votar");
        }
    }
}
