import entities.Converter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        Converter.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        Converter.neededDollars = sc.nextDouble();

        System.out.printf("Amout to be paid in reais = %.2f", Converter.converter());

    }
}