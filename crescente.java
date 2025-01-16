import java.util.Locale;
import java.util.Scanner;

public class crescente {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        float[] posicao = new float[2];
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        posicao[0] = sc.nextFloat();
        System.out.println();

        System.out.print("Digite o segundo número: ");
        posicao[1] = sc.nextFloat();
        System.out.println();

        if (posicao[0] > posicao[1]) {
            System.out.printf("O número %.2f é maior, ordem crescente:%.2f - %.2f",posicao[1], posicao[1], posicao[0]);
        } else {
            System.out.printf("O número %.2f é maior, ordem crescente: %.2f - %.2f",posicao[0], posicao[0], posicao[1]); 
        }    
        




        sc.close();   
    }
}
