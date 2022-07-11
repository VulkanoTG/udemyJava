package conditionalstructures;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, value;


        System.out.println("Informe os horarios com base em 24h");
        System.out.println("Digite o horario de inicio!");
        a = sc.nextInt();
        System.out.println("Digite o Horario do final!");
        b = sc.nextInt();


        if (a < b) {
           value = a - b;
            System.out.printf("O jogo durou %d horas", value);
        } else {
            value = 24 - a + b;
            System.out.printf("O jogo durou %d horas", value);
        }

        sc.close();
    }
}
