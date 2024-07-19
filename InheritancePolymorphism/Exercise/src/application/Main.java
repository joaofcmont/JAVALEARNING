package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        System.out.println("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();

        for(int i =1; i<=numberOfProducts; i++){
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            String typeOfProduct = sc.next();
            if(typeOfProduct.equals("i")) {
                System.out.println("Name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("Customs fee: ");
                double fee = sc.nextDouble();

                Product p1 = new ImportedProduct(name,price,fee);
                productList.add(p1);
            }else if(typeOfProduct.equals("u")){
                System.out.println("Name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Product p1 = new UsedProduct(name,price,date);
                productList.add(p1);
            }else if(typeOfProduct.equals("c")){
                System.out.println("Name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();

                Product p1 = new Product(name,price);
                productList.add(p1);
            }
        }

        System.out.println("PRICE TAGS:");
        for(Product p : productList){
            System.out.println(p.priceTag());
        }


        sc.close();
    }
}