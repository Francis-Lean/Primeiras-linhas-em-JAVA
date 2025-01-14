import java.util.Scanner;

public class ex6Condicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Possiveis intervalos ([0,25], (25,50], (50,75], (75,100])");
        
        System.out.print("Digite um valor:");
        int valor = sc.nextInt();

        if (valor >= 0 && valor <= 25) {
            System.out.printf("%d está entre 0-25", valor);
        }
        else if (valor >= 25 && valor <= 50) {
            System.out.printf("%d está entre 25-50", valor);
        }
        else if (valor >= 50 && valor <= 75) {
            System.out.printf("%d está entre 50-75", valor);
        }
        else if (valor >= 75 && valor <= 100) {
            System.out.printf("%d está entre 75-100", valor);
        }
        else {
            System.out.println("O valor está fora dos intervalos informados.");
        }
        


        sc.close();
    }
}
