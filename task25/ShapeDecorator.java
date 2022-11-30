package ru.mirea.task25;

public class ShapeDecorator implements Shape {
    protected Shape shape;

    protected ShapeDecorator(Shape s) {
        this.shape = s;
    }

    @Override
    public void draw() {
        if (shape != null) {
            shape.draw();
        }
    }
}
