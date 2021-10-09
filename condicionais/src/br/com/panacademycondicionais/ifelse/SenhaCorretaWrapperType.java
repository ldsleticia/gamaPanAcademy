package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class SenhaCorretaWrapperType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        Integer senhaDigitada;

        senha = 1234;

        System.out.println("Digite sua senha");
        senhaDigitada = sc.nextInt();

        if(senhaDigitada.equals(senha)){
            System.out.println("Acesso autorizado");
        } else{
            System.out.println("Acesso não autorizado");
        }
    }
}
