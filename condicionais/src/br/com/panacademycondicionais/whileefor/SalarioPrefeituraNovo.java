package br.com.panacademycondicionais.whileefor;

import java.util.Scanner;

public class SalarioPrefeituraNovo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDeHabitantes = 3;
        double salarioDoHabitante = 0;
        int qtdFilhosDoHabitante = 0;
        double mediaSalarial = 0;
        int mediaDeFilhos = 0;
        double maiorSalario = 0;
        double pctDeSalariosAte100 = 0;
        int qtdDeSalariosAte100 = 0;
        double somatorioDosSalarios = 0;
        int somatorioDeFilhos = 0;

        for (int i = 0; i < numeroDeHabitantes; i++) {
            System.out.println("Qual o seu salario? ");
            salarioDoHabitante = sc.nextDouble();
            System.out.println("Quantos filhos voce tem? ");
            qtdFilhosDoHabitante = sc.nextInt();
            somatorioDosSalarios = somatorioDosSalarios + salarioDoHabitante;
            somatorioDeFilhos = somatorioDeFilhos + qtdFilhosDoHabitante;
            if (salarioDoHabitante > maiorSalario) {
                maiorSalario = salarioDoHabitante;
            }
            if (salarioDoHabitante <= 100.00) {
                qtdDeSalariosAte100 = qtdDeSalariosAte100 + 1;
            }
        }
        mediaSalarial = somatorioDosSalarios / numeroDeHabitantes;
        mediaDeFilhos = somatorioDeFilhos / numeroDeHabitantes;
        pctDeSalariosAte100 = (qtdDeSalariosAte100 / numeroDeHabitantes) * 100.00;
        System.out.println("Media Salarial = " + mediaSalarial
                + "\nMaior salario = " + maiorSalario
                + "\nMedia de filhos = " + mediaDeFilhos
                + "\nPorcentagem de salarios ate 100.00 = " + pctDeSalariosAte100);
    }
}
