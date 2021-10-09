package br.com.panacademycondicionais.ifelse;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario;
        salario = 1400.00;

        if(salario < 2500.00){
            System.out.println("A sua alíquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350,00");
        }
        else if( salario < 3800){
            System.out.println("A sua alíquota é de 23%");
            System.out.println("Você pode deduzir até R$ 630,00");
        }
    }
}
