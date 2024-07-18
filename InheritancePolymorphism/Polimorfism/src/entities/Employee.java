package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;


    public Employee(){}

    public Employee(Integer hours, String name, Double valuePerHour) {
        this.hours = hours;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return valuePerHour*hours;
    }

}
