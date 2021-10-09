package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class PodeVotarComScaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoDeNascimento;
        int anoAtual;

        System.out.println("Digite o ano de seu nascimento");
        anoDeNascimento = sc.nextInt();

        System.out.println("Digit o ano atual");
        anoAtual = sc.nextInt();
        if (anoAtual - anoDeNascimento == 16 || anoAtual - anoDeNascimento == 17 || anoAtual - anoDeNascimento >= 65) {
            System.out.println("Seu voto é facultativo");
        } else if (anoAtual - anoDeNascimento >= 18) {
            System.out.println("Seu voto é obrigatório");
        } else {
            System.out.println("Não pode votar");
        }
    }
}
