package exercisespt3;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gas Station\n Digite:\n 1-Álcool\n 2-Gasolina\n 3-Diesel\n 4-Cancelar");
        int code = sc.nextInt();

        int alc = 0; //Álcool
        int gas = 0; //Gasolina
        int dies = 0; //Diesel

        while ( code != 4) {
            if ( code == 1) {
                System.out.println("Selecionado: Álcool");
                alc += 1;
            } else if ( code == 2){
                System.out.println("Selecionado: Gasolina");
                gas += 1;
            } else if (code == 3){
                System.out.println("Selecionado: Diesel");
                dies += 1;
            } else {
                System.out.println("Código invalido, digite novamente!");
            }

            System.out.println("Digite o Código novamente");
            code = sc.nextInt();
        }

        System.out.printf("Muito Obrigado\n Álcool: %d\n Gasolina: %d\n Diesel: %d", alc, gas, dies);

        sc.close();
    }


}
