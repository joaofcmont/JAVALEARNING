package entities;

import entitiesEnum.Color;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area(){
        return width*height;
    }



}
