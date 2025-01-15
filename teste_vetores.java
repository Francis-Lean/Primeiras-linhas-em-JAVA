import java.util.Scanner;

public class teste_vetores {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int[] idades = new int[3];
        
        System.out.println("Digite à idade dos alunos que foram suspensos. ");
        System.out.print("Idade do aluno 1:");
        idades[0] = sc.nextInt();
        System.out.println();

        System.out.print("Idade do aluno 2:");
        idades[1] = sc.nextInt();
        System.out.println();

        System.out.print("Idade do aluno 3:");
        idades[2] = sc.nextInt();
        System.out.println();

        System.out.printf("Então os alunos possuem as seguintes idades: %d, %d e %d anos",idades[0], idades[1], idades[2]);







        sc.close();
    }
}
