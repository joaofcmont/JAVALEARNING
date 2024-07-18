package entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(){}

    public OutsourcedEmployee(Integer hours, String name, Double valuePerHour, Double additionalCharge) {
        super(hours, name, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
       return super.payment()+ (1.1*additionalCharge);

    }
}
