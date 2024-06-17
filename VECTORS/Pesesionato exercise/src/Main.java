import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String [] rooms = new String[10];

        System.out.println("How many rooms will be rented?");
        int numberOfRoomsRented = sc.nextInt();

        for(int i = 1; i<=numberOfRoomsRented;i++){
            sc.nextLine();
            System.out.printf("Rent #%d\n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();

            rooms[room] = name + ", " + email;
        }

        System.out.println("Busy rooms:");
        for(int i =0 ; i<rooms.length;i++){
            if(rooms[i] != null){
                System.out.printf("%d:%s\n ",i, rooms[i]);
            }
        }
        sc.close();
    }
}