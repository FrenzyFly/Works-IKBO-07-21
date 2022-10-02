package ru.mirea.task3.Circle;

public class Circle {
    double rad = 10, length = 62.8, square = 314;
    public void SetRad(double r) {
        rad = r;
        length = 2*r*3.14;
        square = Math.pow(r,2)*3.14;
    }
    public double GetRad() {
        return(rad);
    }
    public void SetLen(double l) {
        length = l;
        rad = l/(2*3.14);
        square = Math.pow(rad,2)*3.14;
    }
    public double GetLen() {
        return(length);
    }
    public void SetSq(double s) {
        square = s;
        rad = Math.pow(s / 3.14, 0.5);
        length = 2 * rad * 3.14;
    }
    public double GetSq() {
        return(square);
    }
}
