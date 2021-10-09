package br.com.panacademycondicionais.ifelse;

public class MaiorNumero {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 6;
        b = 5;
        c = 4;

        if(a < b && b > c){
            System.out.println("B é maior");
        } else if(a < c && c > b){
            System.out.println("C é maior");
        } else if(a > b && a > c){
            System.out.println("A é maior");
        } else {
            System.out.println("Os três números são iguais");
        }
    }
}