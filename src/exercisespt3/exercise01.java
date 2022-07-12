package exercisespt3;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pass = sc.nextInt();

        while ( pass != 2002) {
            System.out.println("Senha errada!");
            pass = sc.nextInt();
        }


        System.out.println("Acesso Permitido!");

        sc.close();
    }
}
