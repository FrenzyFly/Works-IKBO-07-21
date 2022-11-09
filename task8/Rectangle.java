package ru.mirea.task8;
import java.awt.*;

public class Rectangle extends Shape {
    protected Double width;
    protected Double length;

    public Rectangle() {
        super();
        this.col = randomColor();
        this.width = randInt(10, 40);
        this.length = randInt(10, 40);
    }

    public Rectangle(Double w, Double l) {
        super();
        this.width = w;
        this.length = l;
    }

    public Rectangle(Double w, Double l, String c, Boolean f) {
        super(c, f);
        this.width = w;
        this.length = l;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double w) {
        this.width = w;
    }

    public Double getLength() {
        return this.length;
    }

    public void setLength(Double l) {
        this.length = l;
    }

    @Override
    public Double getArea() {
        return this.length * this.width;
    }

    @Override
    public Double getPerimeter() {
        return (this.length + this.width)*2;
    }

    public void draw(Graphics g) {
        g.setColor(this.col);
        g.fillRect(randInt(20, 450).intValue(), randInt(20, 450).intValue(), this.length.intValue(), this.width.intValue());
    }

    @Override
    public String toString() {
        return ("Colour: " + this.color + ", filled: " + this.fill + ", width: " + this.width + ", length " + this.length + ", area: " + getArea() + ", perimeter: " + getPerimeter());
    }
}
