package br.com.panacademycondicionais.whileefor;

import java.util.Scanner;

public class EhNumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado;
        int i;
        int flag;

        flag = 0;

        System.out.println("Digite um número");
        numeroDigitado = sc.nextInt();

        if (numeroDigitado == 0 || numeroDigitado == 1) {
            System.out.println("Não é um número primo");
        } else{
            for (i = 2; i < numeroDigitado; i++) {
                if (numeroDigitado % i == 0) {
                    System.out.println(numeroDigitado + "Não é número primo");
                }
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(numeroDigitado + "É um número primo");
        }
    }
}