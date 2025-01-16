import java.util.Scanner;

public class tipoTriangulo {
    
    public static void main(String[] args){

        int[] triangulo = new int[3];
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite os 3 lados da forma geométrica:");
        triangulo[0] = sc.nextInt();
        triangulo[1] = sc.nextInt();
        triangulo[2] = sc.nextInt();

        if (triangulo[0] + triangulo[1] < triangulo[2] || triangulo[1] + triangulo[2] < triangulo[0]){
            System.out.println("A forma geométrica não é um triângulo.");
        } else if (triangulo[0] == triangulo[1] && triangulo[1] == triangulo [2]) {
            System.out.println("A forma geométrica é um triângulo equilátero.");
        } else if (triangulo[0] == triangulo[1] || triangulo[1] == triangulo[2]) {
            System.out.println("A forma geométrica é um triângulo isósceles.");
        } else if (triangulo[0] != triangulo[1] || triangulo[1] != triangulo[2]) {
            System.out.println("A forma geométrica é um triângulo escaleno.");
        }






        sc.close();
    }
}
