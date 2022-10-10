package ru.mirea.task7.Shape;

public class Square extends Rectangle {
    public Square() {}
    public Square(double s) {
        super(s, s);
    }
    public Square(double s, String c, boolean f) {
        super(s, s, c, f);
    }
    public double getSide() {
        return this.width;
    }
    public void setSide(double s) {
        this.width = s;
        this.length = s;
    }
    public String toString() {
        return ("Colour: " + this.colour + ", filled: " + this.filled + ", side: " + this.width + ", area: " + getArea() + ", perimeter: " + getPerimeter());
    }
}
