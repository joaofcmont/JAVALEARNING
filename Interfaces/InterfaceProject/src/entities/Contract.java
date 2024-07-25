package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private int number;
    private LocalDate date;
    private double totalValue;

    List<Installment> installmentList = new ArrayList<>();

    public Contract(int number, double totalValue, LocalDate date) {
        this.number = number;
        this.totalValue = totalValue;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

}
