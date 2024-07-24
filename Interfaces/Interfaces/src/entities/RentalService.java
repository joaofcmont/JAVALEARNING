package entities;

import java.time.Duration;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;
    private PortugalTaxService portugalTaxService;

    public RentalService(double pricePerHour, PortugalTaxService portugalTaxService, double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.portugalTaxService = portugalTaxService;
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public PortugalTaxService getPortugalTaxService() {
        return portugalTaxService;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void processInvoice(CarRental carRental){
         double durationMinutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double durationHours = durationMinutes/60.0;

        double basicPayment ;
        if(durationHours<=12 ){
            basicPayment= pricePerHour *Math.ceil(durationHours) ;
        }else{
            basicPayment = pricePerDay*Math.ceil(durationHours/24);
        }
        double tax = portugalTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }

}
