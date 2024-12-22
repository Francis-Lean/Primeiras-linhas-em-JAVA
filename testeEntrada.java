import java.util.Scanner;

public class testeEntrada {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Digite dois números para saber a sua soma");
        System.out.print("Primeiro número: ");
        n1 = sc.nextInt();
        System.out.println();
        System.out.print("Segundo número: ");
        n2 = sc.nextInt();
        soma = n1 + n2;
        System.out.printf("A soma entre %d e %d é %d.", n1, n2, soma);





        sc.close();
    }   
}
