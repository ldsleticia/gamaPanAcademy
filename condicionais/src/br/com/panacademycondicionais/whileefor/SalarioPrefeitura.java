package br.com.panacademycondicionais.whileefor;

import java.util.Arrays;
import java.util.Scanner;

public class SalarioPrefeitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int habitantes;
        double[] salarios = new double[20];
        int numeroDeFilhos;
        double maiorSalario;
        double mediaSalarial;
        double porcentagemSalarioAteCem;
        double quantidadeSalarioAteCem;
        int i;
        int j;
        int soma;

        habitantes = 20;
        i = -1;
        soma = 0;
        quantidadeSalarioAteCem = 0;

        while (++i < habitantes) {
            System.out.println("Digite o salário " + (i + 1));
            salarios[i] = sc.nextInt();
        }
        for (j = 0; j < salarios.length; j++) {
            soma += salarios[j];
        }

        mediaSalarial = soma / 20;

        Arrays.sort(salarios);

        maiorSalario = salarios[19];

        for (double s :
                salarios) {
            if (s <= 100) {
                quantidadeSalarioAteCem++;
            }
        }

        porcentagemSalarioAteCem = (quantidadeSalarioAteCem / 20) * 100;

        System.out.println(mediaSalarial);
        System.out.println(maiorSalario);
        System.out.println(porcentagemSalarioAteCem);
    }
}
