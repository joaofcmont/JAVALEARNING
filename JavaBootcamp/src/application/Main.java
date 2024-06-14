package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x = new Rectangle();
        System.out.println("Enter the rectangle widht and height:");

        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        x.toString();




    }
}