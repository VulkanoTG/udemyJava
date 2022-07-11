package conditionalstructures;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o eixo X");
        double x = sc.nextDouble();
        System.out.println("Digite o eixo Y");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("eixo X");
        } else if ( y == 0.0) {
            System.out.println("eixo y");
        } else if ( x > 0.0 && y > 0.0) {
            System.out.println("Ponto em Q1");
        } else if ( x < 0.0 && y > 0.0) {
            System.out.println("Ponto em Q2");
        } else if ( x < 0.0 && y < 0.0) {
            System.out.println("Ponto em Q3");
        } else {
            System.out.println("Ponto em Q4");
        }
        sc.close();
    }
}
