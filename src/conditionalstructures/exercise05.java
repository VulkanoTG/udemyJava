package conditionalstructures;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        double value;


        System.out.println("código: 1, Produto: Cachorro Quente, preço: $4,00");
        System.out.println("código: 2, Produto: X-Salada, preço: $4,50");
        System.out.println("código: 3, Produto: X-Bacon, preço: $5,00");
        System.out.println("código: 4, Produto: Torrada Simples, preço: $2,00");
        System.out.println("código: 5, Produto: Refrigerante, preço: $0,50");
        System.out.println();
        System.out.print("Digite o código do produto: ");
        a = sc.nextInt();
        System.out.print("Digite a quantidade que deseja: ");
        b = sc.nextInt();


        if (a == 1) {
            value = b * 4.00;
            System.out.printf("o Valor deu %.2f", value);
        } else if (a == 2) {
            value = b * 4.50;
            System.out.printf("o Valor deu %.2f", value);
        } else if (a == 3) {
            value = b * 5.00;
            System.out.printf("o Valor deu %.2f", value);
        } else if (a == 4) {
            value = b * 2.00;
            System.out.printf("o Valor deu %.2f", value);
        } else if (a == 5) {
            value = b * 1.50;
            System.out.printf("o Valor deu %.2f", value);
        } else {
            System.out.println("Código não cadastrado!");
        }

        sc.close();
    }
}
