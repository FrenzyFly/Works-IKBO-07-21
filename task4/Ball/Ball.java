package ru.mirea.task4.Ball;

public class Ball {
    private double x = 0.0, y = 0.0;
    public Ball(double xi, double yi) {
        x = xi;
        y = yi;
    }
    public Ball() {}
    public double getX() {
        return x;
    }
    public void setX(double xi) {
        x = xi;
    }
    public double getY() {
        return y;
    }
    public void setY(double yi) {
        y = yi;
    }
    public void setXY(double xi, double yi) {
        x = xi;
        y = yi;
    }
    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }
    public String toString() {
        return ("X = " + x + ", Y = " + y);
    }
}
