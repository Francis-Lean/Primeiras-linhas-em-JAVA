import java.util.Locale;
import java.util.Scanner;

public class classificacaoNotas {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        float[] notas = new float[3];
        String aluno;
        float media;
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o nome do aluno: ");
        aluno = sc.nextLine();
        System.out.println();

        System.out.println("Digite as três notas do aluno: ");
        notas[0] = sc.nextFloat();
        notas[0] = sc.nextFloat();
        notas[0] = sc.nextFloat();

        media = notas[0] + notas[1] + notas[2] / 3;

        if (media >= 7) {
            System.out.printf("O(a) aluno(a) %s teve média %.2f e foi APROVADO.",aluno, media);
        } else if (media >= 5 && media < 7) {
            System.out.printf("O(a) aluno(a) %s teve média %.2f e esta de RECUPERAÇÃO.",aluno, media); 
        } else {
            System.out.printf("O(a) aluno(a) %s teve média %.2f e esta REPROVADO.", aluno, media);
        }



        sc.close();
    }
    
}
