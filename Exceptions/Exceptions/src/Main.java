import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();
        System.out.println("FIM DO PROGRAMA");

    }

    public static void method1(){
        System.out.println("*****Método 1 STARTED****");
        method2();
        System.out.println("*****Método 1 END****");

    }

    public static void method2(){
        System.out.println("Método 2 STARTED ");
        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
            //imprimir o rastreamento do stack
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }finally{
            System.out.println("*****Método 2 END****");
            sc.close();
        }

    }
}