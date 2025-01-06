import java.util.Scanner;

public class ex3Condicionais {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A % B == 0) {
            System.out.printf("O número %d é múltiplo de %d", A, B);
        } else if (B % A == 0) {
            System.out.printf("O número %d é múltiplo de %d", B, A);
        } else {
            System.out.printf("%d e %d não são múltiplos entre si.", A, B);
        }
        

        sc.close();
    }
}
