package ru.mirea.task7.Movable;
import ru.mirea.task7.Movable.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xs, int ys) {
        topLeft = new MovablePoint(x1, y1, xs, ys);
        bottomRight = new MovablePoint(x2, y2, xs, ys);
    }
    public String toString() {
        return(topLeft.toString() + ", " + bottomRight.toString());
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
