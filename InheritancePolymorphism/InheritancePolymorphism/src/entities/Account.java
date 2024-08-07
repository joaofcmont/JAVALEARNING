package entities;

public class Account {

    private Integer number;
    private String name;
    protected Double balance;

    public Account(){}

    public Account(Integer number, Double balance, String name) {
        this.number = number;
        this.balance = balance;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }
}
