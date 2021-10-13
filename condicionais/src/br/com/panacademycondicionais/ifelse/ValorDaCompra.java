package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class ValorDaCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double precoSemDesconto;
        final double precoComDesconto;
        int quantidadeDeMacas;

        precoSemDesconto = 0.30;
        precoComDesconto = 0.25;

        System.out.println("Digite a quantidade de maçãs que você quer comprar");
        quantidadeDeMacas = sc.nextInt();

        if(quantidadeDeMacas < 12){
            System.out.println("Você vai pagar " + Math.round(quantidadeDeMacas * precoSemDesconto * 100) / 100.00);
        } else {
            System.out.println("Você vai pagar " + Math.round(quantidadeDeMacas * precoComDesconto * 100) / 100.00);
        }
    }
}
