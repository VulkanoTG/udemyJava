package sequencialstructures;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, value;
        System.out.println("Digite o Primeiro número!");
        a = sc.nextInt();
        System.out.println("Digite o segundo número!");
        b = sc.nextInt();
        System.out.println("Digite o terceiro número!");
        c = sc.nextInt();
        System.out.println("Digite o quarto número!");
        d = sc.nextInt();

        value = a * b - c * d;

        System.out.printf("A diferença entre o produto de %d, %d e %d, %d é de %d", a, b, c, d, value);
    }

}
