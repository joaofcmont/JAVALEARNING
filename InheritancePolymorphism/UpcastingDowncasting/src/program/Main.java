package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        //Upcasting and Downcasting

        //Upcasting
        //casting da subclasse para a superclasse
        //polimorfismo

        //Downcasting
        //casting da superclasse para subclasse
        // instanceof
        // métodos que recebem parametros genéricos(Equals)


        Account acc = new Account(1001,"Joao", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0, 500.0);

        //UPCASTING
        // não da erro pq a herança é uma relação de "é-um"
        // uma business account é uma conta
        Account acc1= bacc;
        Account acc2 = new BusinessAccount(1003, "Jorge", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Mariana", 0.0, 0.01);

        // DOWNCASTING
        //superclasse-> subclasse
        // forçar a conversão
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        //acc3 is not an Bussiness Account
        // not permited, but not giving an error
        // the compilor cannot see this issue,only the programmer
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("LOAN!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }







    }
}