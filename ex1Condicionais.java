import java.util.Scanner;

public class ex1Condicionais {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        int N = sc.nextInt();

        if (N < 0) {
                System.out.println("O NÚMERO DIGITADO É NEGATIVO");
        }
        else {
                System.out.println("O NÚMERO DIGITADO NÃO É NEGATIVO");
        }


        sc.close();
    }
}
