package ru.mirea.task7.Movable;
import ru.mirea.task7.Movable.MovablePoint;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int xi, int yi, int xs, int ys, int r) {
        center = new MovablePoint(xi, yi, xs, ys);
        radius = r;
    }
    public String toString() {
        return(center.toString() + ", radius: " + radius);
    }
    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveLeft() {
        center.moveLeft();
    }
    public void moveRight() {
        center.moveRight();
    }
}
