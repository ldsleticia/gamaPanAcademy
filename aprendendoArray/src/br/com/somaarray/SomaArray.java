package br.com.somaarray;

public class SomaArray {
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int soma = 0;
        int media;
        int maior = 0;
        int menor = 100000;

        for(int i : array){
            soma += i;
            if(i > maior){
                maior = i;
            } if(i < menor){
                menor = i;
            }
        }
        System.out.println(soma);
        media = soma/array.length;
        System.out.println("A média entre os valores do array é " + media);
        System.out.println("O menor valor do array é " + menor);
        System.out.println("O maior valor do array é " + maior);
    }
}
