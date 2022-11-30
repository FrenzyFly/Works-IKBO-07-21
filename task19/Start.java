package ru.mirea.task19;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        try {
            RectTriangle triangle = new RectTriangle(a, b, c);
        } catch (BadAngles exception) {
            System.out.println(exception.toString());
        }
    }
}
