package program;

import entities.Contract;
import entities.Installment;
import serviceEntities.ContractService;
import serviceEntities.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the data of the contract: ");
        System.out.println("Number: ");
        int numberContract = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): " );
        LocalDate dateContract  = LocalDate.parse(sc.next(),sdf);
        System.out.print("Value of contract: ");
        double valueContract = sc.nextDouble();
        System.out.print("Enter the number of portion: ");
        int numberPortions = sc.nextInt();

        Contract contract = new Contract(numberContract, valueContract, dateContract);

        ContractService service= new ContractService(new PaypalService());

        service.processContract(contract,numberPortions);

        System.out.println();
        System.out.println("PORTIONS: ");
        for(Installment i: contract.getInstallmentList()){
            System.out.println(i);
        }

    }
}