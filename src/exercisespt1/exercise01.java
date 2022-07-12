package exercisespt1;

import java.util.Scanner;

public class exercise01 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, value;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Digite o Segundo Valor: ");
        b = sc.nextInt();

        value = a + b;

        System.out.printf("A Soma entre os Valores %d e %d é igual a: %d", a, b, value);
        sc.close();
    }
}
