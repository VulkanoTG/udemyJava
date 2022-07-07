package sequencialstructures;

import java.util.Locale;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //vars
        int a, b;
        double c;

        System.out.println("Digite o número do funcionario!");
        a = sc.nextInt();
        System.out.println("Digite as horas trabalhadas!");
        b = sc.nextInt();
        System.out.println("Digite o valor recebido por hora!");
        c = sc.nextDouble();

        double value = b * c;

        System.out.println("Funcionario n°: " + a);
        System.out.printf(Locale.US, "Salário: $%.2f", value);

    }
}
