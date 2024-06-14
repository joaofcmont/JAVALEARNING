package entities;

public class Converter {

    public static double dollarPrice;
    public static double neededDollars;

    public static double converter(){
        return (dollarPrice*neededDollars) + (dollarPrice*neededDollars*0.06);
    }
}
