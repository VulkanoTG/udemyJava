package exercisespt3;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Coordenada de X");
        int x = sc.nextInt();
        System.out.println("Digite a Coordenada de Y");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 ) { // else if (x < 0 && y < 0)
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            System.out.println("Digite a Coordenada de X");
            x = sc.nextInt();
            System.out.println("Digite a Coordenada de Y");
            y = sc.nextInt();
        }
        System.out.println("uma Coordenada foi zerada");
        sc.close();
    }
}
