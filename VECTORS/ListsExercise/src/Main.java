import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int numberOfWorkers = sc.nextInt();

        List<Employee> employeeList= new ArrayList<>(numberOfWorkers);

        for(int i=1; i<=numberOfWorkers; i++){
            System.out.println("Employee " + "#" + i);
            System.out.print("Id: ");
            int id= sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id,name,salary);
            employeeList.add(employee);
        }

        System.out.println("Enter the employee Id that will receive an raise: ");
        int raiseId= sc.nextInt();
        for(Employee e : employeeList){
            if(e.id!=raiseId){
                System.out.println("This id does not exist!");
            }else{
                System.out.println("Enter the percentage: ");
                double percentage = sc.nextDouble();
                e.salary = ((percentage/100)*e.getSalary())  + e.getSalary();
                System.out.println(e.salary);
            }

        }

        System.out.println("List of Employees: ");
        for(Employee e : employeeList){
            System.out.println(e.toString());
        }




sc.close();

    }
}