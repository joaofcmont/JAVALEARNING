package program;

import entities.CarRental;
import entities.PortugalTaxService;
import entities.RentalService;
import entities.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the data from the rental: ");
        System.out.print("Car Model: ");
        String carModel = sc.nextLine();
        System.out.println("Start (dd/MM/yyyy: hh:mm): ");
        LocalDateTime startRental = LocalDateTime.parse(sc.nextLine(), sdf);
        System.out.println("Return (dd/MM/yyyy: hh:mm): ");
        LocalDateTime finishRental = LocalDateTime.parse(sc.nextLine(), sdf);


        CarRental carRental = new CarRental(startRental,finishRental,new Vehicle(carModel));



        System.out.print("Enter the price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter the price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rs = new RentalService(pricePerHour,new PortugalTaxService(),pricePerDay);

        // instaciando um invoice e associando ao car rental
        rs.processInvoice(carRental);


        System.out.println("FATURA: ");
        System.out.println("Basic Payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()) );
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));


        sc.close();
    }
}