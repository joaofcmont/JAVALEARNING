import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double  maior=0;
        int posmaior =0;

        System.out.println("Quantos numeros voce vai digitar?");
        int numero= sc.nextInt();
        double [] vectNumbers = new double[numero];

        for(int i =0; i<numero;i++){
            System.out.println("Digite um numero: ");
            vectNumbers[i] = sc.nextDouble();
        }
        maior = vectNumbers[0];
        posmaior = 0;


        for (int i=1; i<numero; i++) {
            if (vectNumbers[i] > maior) {
                maior = vectNumbers[i];
                posmaior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.2f\n", maior);

        System.out.println("POSICAO DO MAIOR VALOR = " + posmaior);

            sc.close();
    }
}