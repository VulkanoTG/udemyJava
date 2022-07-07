package sequencialstructures;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double pi, a, value;

        pi = 3.14159;

        System.out.print("Digite o raio do circulo: ");
        a = sc.nextDouble();
        a = Math.pow(a, 2);
        value = a * pi;

        System.out.printf("A area do circulo é de %.2fm²", value);

        sc.close();

    }

}