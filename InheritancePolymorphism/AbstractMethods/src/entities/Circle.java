package entities;

import entitiesEnum.Color;

public class Circle extends  Shape{

    private double radius;


    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }
}
