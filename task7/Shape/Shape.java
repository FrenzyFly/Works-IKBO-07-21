package ru.mirea.task7.Shape;

public abstract class Shape {
    protected String colour;
    protected boolean filled;
    public Shape() {}
    public Shape(String c, boolean f) {
        this.colour = c;
        this.filled = f;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String c) {
        this.colour = c;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean f) {
        this.filled = f;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
