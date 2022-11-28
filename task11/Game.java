package ru.mirea.task11;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Game extends JFrame {
    private JPanel intfc;
    private JButton b1;
    private JTextField textF1;
    private JLabel Label;
    private int num;
    private int attempt;

    public Game() {
        setContentPane(intfc);
        setSize(430, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        play();
    }

    public void play() {
        restart();
        b1.addActionListener(e -> {
            String s = textF1.getText();
            inputCheck(Integer.parseInt(s));
            if(attempt == 3){
                end();
            }
        });
    }

    public void restart() {
        setNum(0, 20);
        System.out.println(getNum());
        Label.setText("Guess the number");
        attempt = 0;
    }

    public void end() {
        Label.setText("The game is over. The answer is: " + num);
    }

    private void inputCheck(int input){
        if (input > num){
            Label.setText("Too big number");
            attempt++;
        }
        else if (input < num){
            Label.setText("Too small number");
            attempt++;
        }
        else {
            Label.setText("Exactly! Congratulations!");
        }
    }

    public void setNum(int min, int max) {
        this.num = ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        var window = new Game();
    }
}
