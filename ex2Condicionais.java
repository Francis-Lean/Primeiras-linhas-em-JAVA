import java.util.Scanner;

public class ex2Condicionais {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int N = sc.nextInt();


        if (N % 2 == 0) {
            System.out.printf("O número %d é um número par!", N);
        }
        else {
            System.out.printf("O número %d não é um número par!", N);
        }

        sc.close();
    }
}
