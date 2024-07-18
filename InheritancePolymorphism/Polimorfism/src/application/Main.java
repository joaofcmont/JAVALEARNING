package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Pilares da OOP
                //Encapsulamento
                //Herança
                //Polimorfismo

        //POLIMORFISMO
        // genérico aponta para especifico

        // Muitas formas, mesma operação com mesmas variaveis
        // mas com comportamentos diferentes
        // apontam para outros objetos

        //A associação entre tipo genérico
        // e o tipo especifico é um upcasting,
        // é feito em tempo de execução


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees");
        int numberOfEmployees = sc.nextInt();
        List<Employee> employeeList = new ArrayList<>(numberOfEmployees);

        for(int i =1; i<=numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data");
            System.out.print("Outsourced (y/n)? ");
            String outsourced = sc.next();
            sc.nextLine();
            if (outsourced.equals("y")) {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();
                Employee employee = new OutsourcedEmployee(hours, name, valuePerHour, additionalCharge);
                employeeList.add(employee);
            } else {
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                Employee employee = new Employee(hours, name, valuePerHour);
                employeeList.add(employee);
            }
        }

            StringBuilder sb = new StringBuilder();
            System.out.println("PAYMENTS: ");

            for(Employee e : employeeList){
                sb.append(e.getName() + "- $ ");
                sb.append(e.payment() + "\n");
        }
            System.out.println(sb.toString());


        sc.close();
    }
}