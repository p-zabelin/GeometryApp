package com.example.app;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;
import com.example.geometry.utils.UnitConverter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Димаетр: " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());


        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        UnitConverter converter = new UnitConverter();
        System.out.println(converter.cmToMeters(200));
        System.out.println(converter.metersToCm(2));

    }
}
