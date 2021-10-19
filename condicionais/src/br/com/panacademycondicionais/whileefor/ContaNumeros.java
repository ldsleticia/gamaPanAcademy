package br.com.panacademycondicionais.whileefor;

public class ContaNumeros {
    public static void main(String[] args) {
        int numeroA;
        int numeroB;

        numeroA = 233;
        numeroB = 456;

        while (numeroA <= numeroB){
            if(numeroA < 300 || numeroA > 400){
                numeroA += 5;
            } else {
                numeroA += 3;
            }
            System.out.println(numeroA);
        }
    }
}
