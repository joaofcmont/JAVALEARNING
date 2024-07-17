import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.println("Name: ");
        String clientName = sc.nextLine();
        System.out.println("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDateClient = sdf.parse(sc.nextLine());

        Client client = new Client(clientName,clientEmail,birthDateClient);

        System.out.println("Enter order data:\n");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(),status,client);

        System.out.println("How many items to this order? ");
        int totalItems= sc.nextInt();
        for ( int i=1; i<=totalItems; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName,productPrice);
            System.out.println("Quantity: ");
            int itemsQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(itemsQuantity, productPrice,product);

            order.addItem(orderItem);
        }


        System.out.println(order);

        sc.close();
    }
}