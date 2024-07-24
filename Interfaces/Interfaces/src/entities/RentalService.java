package entities;

import java.time.Duration;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;

    public RentalService(double pricePerHour, PortugalTaxService portugalTaxService, double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

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

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }

}
