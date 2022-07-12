package exercisespt1;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, valuea, valueb, valuec, valued, valuee;
        double pi = 3.14159;

        System.out.println("Insira a primeira medida!");
        a = sc.nextDouble();
        System.out.println("Insira a segunda medida!");
        b = sc.nextDouble();
        System.out.println("Insira a terceira medida!");
        c = sc.nextDouble();

        valuea = (a * c) / 2;
        valueb = Math.pow(c, 2) * pi;
        valuec = ((a + b) * c) / 2;
        valued = b * b;
        valuee = a * b;

        System.out.printf("Área do Triangulo Retangulo: %.3f\n", valuea);
        System.out.printf("Área do Circulo: %.3f\n", valueb);
        System.out.printf("Área do Trapézio: %.3f\n", valuec);
        System.out.printf("Área do Quadrado: %.3f\n", valued);
        System.out.printf("Área do Retangulo: %.3f\n", valuee);

        sc.close();
    }
}
