package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class TrianguloPorLados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Digite o lado A");
        ladoA = sc.nextInt();

        System.out.println("Digite o lado B");
        ladoB = sc.nextInt();

        System.out.println("Digite o lado C");
        ladoC = sc.nextInt();

        if(ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB){
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triângulo Equilátero");
            } else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
}
}