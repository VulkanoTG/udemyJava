package exercisespt1;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        double c, f, value;
        int a, b, d, e;

        System.out.print("Insira o código da peça: ");
        a = sc.nextInt();
        System.out.print("Insira a quantidade de peças: ");
        b = sc.nextInt();
        System.out.print("Insira o valor unitário da peça: ");
        c = sc.nextDouble();

        System.out.println("Peça com ID " + a + " cadastrada com sucesso!");

        System.out.print("Insira o código da peça: ");
        d = sc.nextInt();
        System.out.print("Insira a quantidade de peças: ");
        e = sc.nextInt();
        System.out.print("Insira o valor unitário da peça: ");
        f = sc.nextDouble();

        System.out.println("Peça com ID " + d + " cadastrada com sucesso!");

        value = b * c + e * f;

        System.out.printf("O valor total a ser pago é de %.2f", value);
        sc.close();

    }
}
