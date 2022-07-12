package exercisespt2;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número!");
        double a = sc.nextDouble();

        if (a < 0 || a > 100) {
            System.out.println("fora do intervalo!");
        } else if (a < 25){
            System.out.println("Valor entre [0,25]");
        } else if ( a < 50) {
            System.out.println("Valor entre [25,50]");
        } else if ( a > 75) {
            System.out.println("Valor entre [50,75]");
        } else {
            System.out.println("Valor entre [75,100]");
        }
        sc.close();
    }
}
