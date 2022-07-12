package exercisespt2;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value;

        System.out.println("Digite um número!");
        value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("O número que digitou é Par");
        } else {
            System.out.println("O número que digitou é Impar");
        }

        sc.close();
    }
}
