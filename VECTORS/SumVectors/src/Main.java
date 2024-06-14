import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int sizeVect = sc.nextInt();
        int vectA [] = new int[sizeVect];
        int vectB [] = new int[sizeVect];
        int vectTotal [] = new int[sizeVect];

        System.out.println("DIgite os valores do vetor A:");
        for (int i=0; i<sizeVect;i++){
            vectA[i] = sc.nextInt();
        }
        System.out.println("DIgite os valores do vetor B:");
        for (int i=0; i<sizeVect;i++){
            vectB[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i=0 ; i<sizeVect;i++){
            vectTotal[i] = vectA[i] + vectB[i];
            System.out.println(vectTotal[i]);
        }


    }
}