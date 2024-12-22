import java.util.Locale;
import java.util.Scanner;

public class sequencial02 {
   
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        double raio, area;

        System.out.println("Digite o raio do circulo para saber sua área:");
        raio = sc.nextDouble();

        area = raio * raio * 3.14;
       

        System.out.printf("Se o raio do circulo é %.2f, a área será %.4f", raio, area);
    

        sc.close();
   }  
}
