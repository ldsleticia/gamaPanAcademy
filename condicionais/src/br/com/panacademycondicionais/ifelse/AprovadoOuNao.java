package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class AprovadoOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaA;
        double notaB;
        double media;

        System.out.println("Digite a nota da primeira prova");
        notaA = sc.nextInt();

        System.out.println("Digite a nota da segunda prova");
        notaB = sc.nextInt();

        media = (notaA + notaB) / 2;

        if(media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if(media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
