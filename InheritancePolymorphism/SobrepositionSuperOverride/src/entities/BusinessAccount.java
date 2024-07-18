package entities;

public class BusinessAccount extends Account{

    private double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount<=loanLimit){
            balance+=amount-10;
        }
    }

    @Override
    public void withdraw(double amout){

        //Word super
        // we use "super" to call the implementation
        // of the superclass
        // saque normal e depois adicionar desconto de 2
        super.withdraw(amout);
        balance-=2.0;
    }

}