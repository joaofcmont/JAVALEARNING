package entities;

public class SavingsAccount extends Account{


    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, Double balance, String name, Double interestRate) {
        super(number, balance, name);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
