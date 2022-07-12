package exercisespt2;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int value;

        System.out.println("Digite um número!");
        value = sc.nextInt();

        if (value == 0) {
            System.out.println("O número que digitou é 0");
        } else if (value <= -1) {
            System.out.println("O número que digitou é Negativo");
        } else {
            System.out.println("O numero que digitou é Positivo");
        }

        sc.close();
    }
}
