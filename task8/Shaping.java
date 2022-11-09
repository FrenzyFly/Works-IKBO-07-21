package ru.mirea.task8;
import ru.mirea.task8.Circle;
import ru.mirea.task8.Rectangle;
import ru.mirea.task8.Shape;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Shaping extends JFrame {
    ArrayList<Shape> sh = new ArrayList<Shape>();

    public Shaping() {
        super("Shapes");
        JFrame.setDefaultLookAndFeelDecorated(true); //Посмотреть что это
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(640, 480);
        setVisible(true);
    }

    public void addRect() {
        Rectangle rectangle = new Rectangle();
        sh.add(rectangle);
    }

    public void addCirc() {
        Circle circleGUI = new Circle();
        sh.add(circleGUI);
    }

    private void Shapel() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int q = 1 + r.nextInt(2);
            if (q == 1) {
                addRect();
            } else {
                addCirc();
            }
        }
    }
    @Override

    public void paint(Graphics g) {
        super.paint(g);
        Shapel();
        for (Shape shape : sh) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {

        var window = new Shaping();
    }
}
