import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar){
            System.out.println("Informe o número que deseja da tabuada ou -1 para sair");
            int num;
            try {
                num = sc.nextInt();
                if(num == -1){
                    break;
                }
                for (int i = 0; i <= 10; i++) {
                    System.out.println(num + " * " + i + " é igual a: " + num * i);
                }
            } catch (InputMismatchException e) {
                System.out.println("Somente números inteiros são permitidos");
                sc.next();
            }
        }
        sc.close();
    }
}
