package entities;

public class Account {

    private int number;
    private String holder;
    protected double balance;

    public Account(){}

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }
}
