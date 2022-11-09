package ru.mirea.task8;
import java.awt.*;
import static java.lang.Math.abs;

public abstract class Shape {
    protected String color;
    protected Color col;
    protected Boolean fill;

    public Shape() {
        this.color = "White";
        this.fill = true;
    }

    public Shape(String c, Boolean f) {
        this.color = c;
        this.fill = f;
    }

    public abstract void draw(Graphics g);

    public Double randInt(int min, int max) {
        max -= min;
        return (Math.random() * ++max) + min;
    }

    public Color randomColor() {
        Color[] cols = new Color[]{new Color(0, 255, 0), new Color(0, 255, 255), new Color(0, 169, 255), new Color(106, 0, 255), new Color(200, 50, 255), new Color(255, 60, 200), new Color(205, 30, 30)};
        return cols[abs(randInt(0, cols.length).intValue()-1)];
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public Boolean isFilled() {
        return this.fill;
    }

    public void setFilled(Boolean f) {
        this.fill = f;
    }

    public abstract Double getArea();

    public abstract Double getPerimeter();

    public abstract String toString();
}
