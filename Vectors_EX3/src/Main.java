import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfPeople ;
        double media;
        double percentagem;
        int menores = 0;
        double sum = 0;



        System.out.println("Quantas pessoas serao digitadas?");
        numberOfPeople = sc.nextInt();

        String[] nomes = new String[numberOfPeople];
        int[] idade = new int[numberOfPeople];
        double[] altura = new double[numberOfPeople];

        for(int i =0; i<numberOfPeople;i++){
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        for (int i=0; i<numberOfPeople; i++){
            sum += altura[i];
        }
        media  = sum /numberOfPeople;
        System.out.printf("Altura média: %.2f\n", media);

        for(int i=0; i<numberOfPeople;i++){
            if(idade[i] <16){
                menores++;
            }
        }
        percentagem = ((double)menores/numberOfPeople ) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f\n", percentagem);

        for(int i=0; i<numberOfPeople;i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }



}