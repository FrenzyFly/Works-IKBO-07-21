package ru.mirea.task7.Movable;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;
    public MovablePoint(int xi, int yi, int xs, int ys) {
        this.x = xi;
        this.y = yi;
        this.xSpeed = xs;
        this.ySpeed = ys;
    }
    public String toString() {
        return ("Point coordinates: (" + this.x + ";" + this.y + ")");
    }
    public void moveUp() {
        this.y += this.ySpeed;
    }
    public void moveDown() {
        this.y -= this.ySpeed;
    }
    public void moveLeft() {
        this.x -= this.xSpeed;
    }
    public void moveRight() {
        this.x += this.xSpeed;
    }
}
