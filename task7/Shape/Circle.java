package ru.mirea.task7.Shape;

public class Circle extends Shape {
    protected double radius;
    public Circle() {}
    public Circle(double r) {
        radius = r;
    }
    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getArea() {
        return (Math.pow(radius, 2) * 3.14);
    }
    public double getPerimeter() {
        return (2 * 3.14 * radius);
    }
    public String toString() {
        return ("Colour: " + this.colour + ", filled: " + this.filled + ", radius: " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter());
    }
}
