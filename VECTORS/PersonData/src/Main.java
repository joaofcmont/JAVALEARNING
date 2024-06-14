import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int numberOfPeople = sc.nextInt();
        double [] alturaVect = new double[numberOfPeople];
        char [] generoVect = new char[numberOfPeople];
        double menor = alturaVect[0];
        double maior = alturaVect[0];
        double mediaAlturas=0;
        double totalAlturas=0;
        int numeroHomens =0;

        for(int i=1;i<numberOfPeople;i++){
            System.out.printf("Altura da %da pessoa: ", i);
            alturaVect[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ",i);
            generoVect[i] = sc.next().charAt(0);
        }
        for (int i =1; i<numberOfPeople;i++) {
            if (alturaVect[i] < menor) {
                menor = alturaVect[i];
            }
            if (alturaVect[i] > maior) {
                maior = alturaVect[i];
            }
        }
        for(int i=0; i<numberOfPeople; i++){
            if (generoVect[i]=='F') {
                totalAlturas += alturaVect[i];
            }else{
                numeroHomens++;
            }

            mediaAlturas = totalAlturas/2;
        }


        System.out.printf("Menor altura = %.2f\n", menor );
        System.out.printf("Maior altura = %.2f\n", maior  );
        System.out.printf("Media das alturas das Mulheres = %.2f\n", mediaAlturas);
        System.out.printf("Numero de homens  = %d\n", numeroHomens  );

    }
}