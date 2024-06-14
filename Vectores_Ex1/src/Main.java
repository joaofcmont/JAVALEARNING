import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int numbers = scanner.nextInt();
        int[] vect = new int[numbers];

        for(int i=0 ; i<numbers; i++){
            System.out.println("Digite um numero:");
            vect[i] = scanner.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS");

        for(int i=0; i<numbers;i++){
            if(vect[i] < 0 ){
                System.out.printf("%d\n", vect[i]);
            }
        }
        scanner.close();
    }
}