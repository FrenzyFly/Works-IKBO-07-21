package ru.mirea.task7.Shape;
import ru.mirea.task7.Shape.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // new Circle parameters
        System.out.println(s1.getArea()); // new Circle parameters
        System.out.println(s1.getPerimeter()); // new Circle parameters
        System.out.println(s1.getColour()); // new Circle parameters
        System.out.println(s1.isFilled()); // new Circle parameters
        // System.out.println(s1.getRadius()); // Doesn't belong to Shape
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1); // new Circle parameters
        System.out.println(c1.getArea()); // new Circle parameters
        System.out.println(c1.getPerimeter()); // new Circle parameters
        System.out.println(c1.getColour()); // new Circle parameters
        System.out.println(c1.isFilled()); // new Circle parameters
        System.out.println(c1.getRadius()); // new Circle parameters
        // Shape s2 = new Shape(); // Class Shape is an abstract
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3); // new Rectangle parameters
        System.out.println(s3.getArea()); // new Rectangle parameters
        System.out.println(s3.getPerimeter()); // new Rectangle parameters
        System.out.println(s3.getColour()); // new Rectangle parameters
        // System.out.println(s3.getLength()); // Doesn't belong to Shape
        Rectangle r1 = (Rectangle)s3; // Downcast
        System.out.println(r1); // new Rectangle parameters
        System.out.println(r1.getArea()); // new Rectangle parameters
        System.out.println(r1.getColour()); // new Rectangle parameters
        System.out.println(r1.getLength()); // new Rectangle parameters
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // new Square parameters, but no colour and filled
        System.out.println(s4.getArea()); // new Square parameters
        System.out.println(s4.getColour()); // Colour wasn't mentioned
        // System.out.println(s4.getSide()); // Doesn't belong to Shape
// Take note that we downcast Shape s4 to Rectangle, which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2); // new Square parameters, but no colour and filled
        System.out.println(r2.getArea()); // new Square parameters
        System.out.println(r2.getColour()); // Colour wasn't mentioned
        // System.out.println(r2.getSide()); // Doesn't belong to Rectangle
        System.out.println(r2.getLength()); // new Square parameters
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1); // new Square parameters, but no colour and filled
        System.out.println(sq1.getArea()); // new Square parameters
        System.out.println(sq1.getColour()); // Colour wasn't mentioned
        System.out.println(sq1.getSide()); // new Square parameters
        System.out.println(sq1.getLength()); // new Square parameters
    }
}
