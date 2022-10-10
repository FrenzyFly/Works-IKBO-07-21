package ru.mirea.task7.Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {}
    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }
    public Rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        this.width = w;
        this.length = l;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        this.width = w;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double l) {
        this.length = l;
    }
    public double getArea() {
        return (this.width * this.length);
    }
    public double getPerimeter() {
        return (2*(this.width + this.length));
    }
    public String toString() {
        return ("Colour: " + this.colour + ", filled: " + this.filled + ", width: " + this.width + ", length " + this.length + ", area: " + getArea() + ", perimeter: " + getPerimeter());
    }
}