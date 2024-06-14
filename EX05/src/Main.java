import entities.BankAccount;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder: ");
        String accountName = sc.next();
        sc.next();
        System.out.println("Is there an initial deposit (y/n)? ");
        char initial = sc.next().charAt(0);
        if(initial=='y') {
            System.out.println("Enter initial deposit value: ");

            double initialDeposit = sc.nextDouble();
            BankAccount account = new BankAccount(accountNumber, accountName, initialDeposit);

            System.out.printf("Account data: %n Account %d, Holder: %s, Balance: $ %.2f%n", account.getAccountNumber(), account.getAccountName(), account.getInitialDeposit());
            System.out.println("Enter a deposit value: ");

            double deposit = sc.nextDouble();
            account.addMoney(deposit);

            System.out.print("Updated account data: %n");
            System.out.printf("Account data: %n Account %d, Holder: %s, Balance: $ %.2f%n", account.getAccountNumber(), account.getAccountName(),account.getBalance());

            System.out.println("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();

            System.out.println("Updated account data:");
            account.retrieveMoney(withdrawValue);
            System.out.printf("Account data: %n Account %d, Holder: %s, Balance: $ %.2f%n", account.getAccountNumber(), account.getAccountName(),account.getBalance());
        }else{
            BankAccount account = new BankAccount(accountName, accountNumber);
            System.out.printf("Account data: %n Account %d, Holder: %s, Balance: $0.00%n", account.getAccountNumber(), account.getAccountName());
            System.out.println("Enter a deposit value: ");

            double deposit = sc.nextDouble();
            account.addMoney(deposit);

            System.out.println("Updated account data:");
            System.out.printf("Account data: %n Account %d, Holder: %s, Balance: $ %.2f%n", account.getAccountNumber(), account.getAccountName(),account.getBalance() );

            System.out.println("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();

            System.out.println("Updated account data: ");
            account.retrieveMoney(withdrawValue);
            System.out.printf("Account data: %n Account %d, Holder: %s, Balance: $ %.2f%n", account.getAccountNumber(), account.getAccountName(),account.getBalance());
        }




    sc.close();

}
}