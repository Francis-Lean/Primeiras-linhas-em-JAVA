import java.util.Scanner;

public class ex4Condicionais {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário em que o jogo começou e o horário em que terminou: ");
        int inicio = sc.nextInt();
        int termino = sc.nextInt();

        int duracao;

        if (termino > inicio) {
            duracao = termino - inicio; 
        }
        else if (termino < inicio) {
            duracao = (24 - inicio) + termino;
        }
        else {
            duracao = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao); 

        sc.close();
    }
}
