package br.com.panacademycondicionais.whileefor;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNotas;
        double total;
        double nota;

        quantidadeDeNotas = 0;
        total = 0;

        while (true) {
            System.out.println("Digite a próxima nota ou -1 para finalizar");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                quantidadeDeNotas++;
                total += nota;
            } else if (nota == -1) {
                double media = total / quantidadeDeNotas;
                System.out.println("Quantidade de notas totais " + quantidadeDeNotas);
                System.out.printf("Média = %2f%n", media);
                break;
            } else {
                System.out.println("Nota Inválida");
            }
            entrada.close();
        }
    }
}