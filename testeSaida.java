import java.util.Locale;
import java.util.Scanner;

public class testeSaida {

    public static void main (String[]args) {
        System.out.println("Preencha os dados abaixo:");
        System.out.println("nome, idade e peso.");
        
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double peso;

        nome = sc.next();
        idade = sc.nextInt();
        peso = sc.nextDouble();

        Locale.setDefault(Locale.US);

        System.out.printf("Você se chama %s, tem %d e pesa %.2f kg", nome, idade, peso);


        sc.close();    
    }   


}
