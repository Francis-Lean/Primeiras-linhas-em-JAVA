import java.util.Scanner;

public class menor_valor{

    public static void main(String[] args){

        int[] valores = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        valores[0] = sc.nextInt();
        System.out.println();

        System.out.print("Segundo valor: ");
        valores[1] = sc.nextInt();
        System.out.println();

        System.out.print("Terceiro valor: ");
        valores[2] = sc.nextInt();
        System.out.println();

        if (valores[0] < valores[1] && valores[0] < valores[2]) {
            System.out.printf("O valor %d é o menor valor.",valores[0]);
        }else if (valores[1] < valores [0] && valores[1] < valores[2]) {
            System.out.printf("O valor %d é o menor valor.",valores[1]);
        }else {
            System.out.printf("O valor %d é o menor valor.",valores[2]);
        }
        

        sc.close();
    }
}