import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // nao podemos instaciar a classe Account:
       // Account acc1= new Account(1002, 1000.0,"Joao");
        Account acc2 = new SavingsAccount(1003, 1000.0,"Maria",0.01);
        Account acc3 = new BusinessAccount(1004, 1000.0,"Jorge",500.0);

        //UPCASTING
        List<Account> accountList = new ArrayList<>();
        accountList.add(new SavingsAccount(1001,1000.0,"Joao",0.01));
        accountList.add(new BusinessAccount(1002,1000.0,"Maria",500.0));
        accountList.add(new SavingsAccount(1003,1000.0,"Jorge",0.01));
        accountList.add(new BusinessAccount(1004,1000.0,"Ana",500.0));

        double sum =0.0;
        for(Account acc : accountList){
            sum+=acc.getBalance();
        }
        System.out.printf("Total Balance:  %.2f%n", sum);


        for(Account acc : accountList){
            acc.deposit(10);
        }
        for(Account acc : accountList) {
            System.out.printf("Updated Balance:  %.2f%n", acc.getBalance());
        }






    }
}