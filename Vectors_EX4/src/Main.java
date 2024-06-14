import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");

        int size = sc.nextInt();
        int [] vect = new int[size];
        int numbersOfPars = 0;
        int [] pares = new int[numbersOfPars];

        for( int i=0 ; i<size;i++){
            System.out.println("Digite um numero:");
            vect[i] = sc.nextInt();
        }
        System.out.println("\nNUMEROS PARES:");
        for(int i =0; i<size;i++){
            if(vect[i] % 2 ==0){
                System.out.printf("%d  ", vect[i]);
                numbersOfPars++;
            }
        }

        System.out.println("\nQuantidade de numeros pares = " + numbersOfPars);

        sc.close();
    }
}