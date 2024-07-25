package serviceEntities;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amount) {
        return amount*0.02;
    }

    @Override
    public double interrest(double amount, int months) {
        return amount*0.01*months;
    }

    public PaypalService() {
    }


}
