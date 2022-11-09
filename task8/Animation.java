package ru.mirea.task8;
import javax.swing.*;
import java.util.Objects;

public class Animation extends JFrame {
    private JLabel f;
    private int fnum = 1;

    private Animation() {
        setSize(1200, 1200);
        f = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource("1.png"))), SwingConstants.CENTER);
        getContentPane().add(f);
        Timer t = new Timer(1000, e -> nextf());
        t.start();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void nextf() {
        f.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource((++fnum) + ".png"))));
        if (fnum == 5) {
            fnum = 0;
        }
    }

    public static void main(String[] args) {
        Animation app = new Animation();
    }
}
