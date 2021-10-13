package br.com.panacademycondicionais.ifelse;

import java.util.Scanner;

public class TrianguloPorAngulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anguloA;
        int anguloB;
        int anguloC;

        System.out.println("Digite o ângulo A");
        anguloA = sc.nextInt();

        System.out.println("Digite o ângulo B");
        anguloB = sc.nextInt();

        System.out.println("Digite o ângulo C");
        anguloC = sc.nextInt();

        if(anguloA + anguloB + anguloC != 180){
            System.out.println("Ângulo Inválido");
        } else {
            if(anguloA == 90 || anguloB == 90 || anguloC == 90){
                System.out.println("Triângulo Retângulo");
            } else if(anguloA > 90 || anguloB > 90 || anguloC > 90){
                System.out.println("Triângulo Obtusângulo");
            } else if(anguloA < 90 && anguloB < 90 && anguloC < 90) {
                System.out.println("Triângulo Acutângulo");
            }
        }
    }
}
