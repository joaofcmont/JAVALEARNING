package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        //Sobreposição
        //implementação de um metodo de uma superclasse na subclasse
        // Suposto usar a anotação @Override

        Account acc1= new Account(1001,"João", 1500.00);
        Account acc2 = new SavingsAccount(1002, "Mariana", 1500, 0.04);
        Account acc3 = new BusinessAccount(1003, "Jorge", 1500,500);

        acc1.withdraw(500);
        acc2.withdraw(500);
        acc3.withdraw(500);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());
    }
}

