package br.com.somaarray;

public class SomaOsPares {
    public static void main(String[] args) {
        int[] array = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
                125};
        int pares = 0;
        int impares = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                pares = array[i];
                System.out.println("OS pares do array são " + pares);
            } else{
                impares = (array[i]*2);
                System.out.println("Os impares do array * 2 são " + impares);
            }
        }
    }
}
