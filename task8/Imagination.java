package ru.mirea.task8;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Imagination extends JFrame {
    public Imagination() {
        super("Shapes");
        String p = GetP();
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image(p);
        pack();
        setSize(640, 640);
        setVisible(true);
    }

    public void Image(String p){
        try {
            BufferedImage img = ImageIO.read(new File(p));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            add(label);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String GetP(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите путь к картинке (src/ru/mirea/task8/coffee.png):");
            return br.readLine();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return "";
    }

    public static void main(String[] args) {
        var windows = new Imagination();
    }
}
