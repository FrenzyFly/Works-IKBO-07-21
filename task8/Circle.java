package ru.mirea.task8;
import java.awt.*;

public class Circle extends Shape {
    protected Double radius;

    public Circle() {
        super();
        this.col = randomColor();
        this.radius = randInt(10, 40);
    }

    public Circle(Double r) {
        super();
        this.radius = r;
    }

    public Circle(Double r, String c, Boolean f) {
        super(c, f);
        this.radius = r;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double r){
        this.radius = r;
    }

    @Override
    public Double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public Double getPerimeter() {
        return 3.14 * 2 * this.radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.col);
        g.fillOval(randInt(20, 450).intValue(), randInt(20, 450).intValue(),
                this.radius.intValue()*2, this.radius.intValue()*2);
    }

    @Override
    public String toString() {
        return ("Colour: " + this.color + ", filled: " + this.fill + ", radius: " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter());
    }
}
