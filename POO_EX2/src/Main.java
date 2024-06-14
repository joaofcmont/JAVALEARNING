import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee x = new Employee();

        System.out.print("Name: ");
        x.name = sc.nextLine();
        System.out.print("Gross salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.tax = sc.nextDouble();

        x.toString();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        x.increaseSalary(percentage);
        System.out.printf("Updated data: %s, $ %.2f", x.name, x.grossSalary);



    }
}