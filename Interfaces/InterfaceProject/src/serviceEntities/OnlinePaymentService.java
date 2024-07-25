package serviceEntities;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interrest(double amount, int months);
}
