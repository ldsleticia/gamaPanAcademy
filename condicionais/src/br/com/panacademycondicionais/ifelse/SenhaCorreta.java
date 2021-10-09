package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        int senhaDigitada;

        senha = 1234;

        System.out.println("Digite sua senha");
        senhaDigitada = sc.nextInt();

        if(senhaDigitada == senha){
            System.out.println("Acesso autorizado");
        } else{
            System.out.println("Acesso não autorizado");
        }
    }
}
