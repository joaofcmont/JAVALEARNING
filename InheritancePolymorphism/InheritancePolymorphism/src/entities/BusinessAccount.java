package entities;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(){
       // we can call super without arguments to be sure in the futurue in case any
       //other logic is added to account, will be added to the business account
        super();
    }

    public BusinessAccount(Integer number, Double balance, String name, Double loanLimit) {
        // call the super construct class
        super(number, balance, name);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount<= loanLimit) {
            balance +=amount - 10;
        }
    }

    // Herança é uma relação "é-um"
    //Generalização/especialização
    //Superclasse(classe base) - subclasse (clase derivada)
    //Herança - extensão
    //Herança é associação entre classes, não objetos
}
