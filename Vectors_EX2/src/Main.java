import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum=0;

        for(int i=0; i<n;i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        for(int i=0;i<n;i++){
             sum += vect[i];
        }

        double media = sum / n;

        System.out.println("VALORES = ");

        for(int i=0; i<n; i++){
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", sum);
        System.out.printf("\nMEDIA = %.2f\n", media);

        sc.close();
    }
}