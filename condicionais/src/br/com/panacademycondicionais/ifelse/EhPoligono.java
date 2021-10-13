package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class EhPoligono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeLados;

        System.out.println("Digite o número de lados");
        quantidadeDeLados = sc.nextInt();

        if (quantidadeDeLados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (quantidadeDeLados > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        } else {
            tipoDePoligono(quantidadeDeLados);
        }
    }

    static void tipoDePoligono(int quantidadeDeLados) {
        switch (quantidadeDeLados) {
            case 3:
                System.out.println("É um Triângulo");
                break;
            case 4:
                System.out.println("É um Quadrado");
                break;
            case 5:
                System.out.println("É um Pentagono");
                break;
        }
    }
}