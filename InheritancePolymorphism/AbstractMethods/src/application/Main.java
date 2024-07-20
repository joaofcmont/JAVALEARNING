package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnum.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int numberOfShapes = sc.nextInt();

        for(int i =1; i<=numberOfShapes;i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if(type == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                 shapeList.add(new Rectangle(color,width,height));
            }else if(type == 'c'){
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color,radius));
            }else{
                System.out.println("Insert a possible shape type!");
            }
        }
        System.out.println("SHAPE AREAS:");
        for(Shape shape : shapeList){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}