package entities;

public class BankAccount {

    private int accountNumber ;
    private String accountName;
    private double initialDeposit =0;
    private double balance;


    public BankAccount(){
    }

    public BankAccount(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(int accountNumber, String accountName , double initialDeposit) {
        super();
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
        this.accountName = accountName;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void addMoney(double moneyDeposited){
        balance = initialDeposit+moneyDeposited;
    }

    public void retrieveMoney(double moneyNeeded){
        balance = balance-moneyNeeded-5;
    }


}
