package estiloFerKipper;

import java.util.Scanner;

public class vetor {
    public static void main (String[] args) {

        int[] sequenciaNumerica = new int[3];

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite uma sequência numérica: ");
        sequenciaNumerica[0] = sc.nextInt();
        sequenciaNumerica[1] = sc.nextInt();
        sequenciaNumerica[2] = sc.nextInt();
        System.out.println();

        if (sequenciaNumerica[0] < sequenciaNumerica[1] && sequenciaNumerica[1] < sequenciaNumerica[2]) {
            System.out.println("A sequência númerica informada está em uma ordem crescente.");
        } else {
            System.out.println("A sequência númerica informada está em uma ordem decrescente ou aleatória.");
        }

        sc.close();
    }
}
