package entities;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance+=balance*interestRate;
    }

    //sobreposition of the method of class "Account"
    @Override
    public void withdraw (double amount){
        balance-=amount;
    }


    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }
}