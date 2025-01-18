import java.util.Scanner;

public class operacoes {

    public static void main(String[] args) {
        
        int codigo;
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o código enviado para o seu e-mail: ");
        codigo = sc.nextInt();

        if (codigo == 456862) {
            System.out.println("O código informado está correto!");
        } else {
            System.out.println("O código informado está incorreto!");
        } 




        sc.close();
    }
    
}
