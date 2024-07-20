package application;

import entities.Person;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<Person>();

        System.out.println("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();
        for(int i=1; i<=numberTaxPayers;i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpensives = sc.nextDouble();
                personList.add(new PessoaFisica(name,anualIncome,healthExpensives));
            }else if(type == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                personList.add(new PessoaJuridica(name,anualIncome,numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Person tp : personList) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.impostoRenda()));
        }

        System.out.println();
        double sum = 0.0;
        for (Person tp : personList) {
            sum += tp.impostoRenda();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();

    }
}