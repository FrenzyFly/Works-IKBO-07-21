package ru.mirea.task4.Ball;
import java.util.Scanner;
import ru.mirea.task4.Ball.Ball;

public class TestBall {
    public static void main(String[] args) {
        double xi, yi;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите координаты мяча:");
        xi = sc.nextDouble();
        yi = sc.nextDouble();
        Ball b = new Ball(xi, yi);
        System.out.println("Введите параметр, который хотите изменить (X, Y, Изменить оба, Передвинуть оба, Никакой):");
        String ans = sc1.nextLine();
        switch (ans) {
            case ("X"):
                xi = sc.nextDouble();
                b.setX(xi);
                break;
            case ("Y"):
                yi = sc.nextDouble();
                b.setY(yi);
                break;
            case ("Изменить оба"):
                xi = sc.nextDouble();
                yi = sc.nextDouble();
                b.setXY(xi, yi);
                break;
            case ("Передвинуть оба"):
                xi = sc.nextDouble();
                yi = sc.nextDouble();
                b.move(xi, yi);
                break;
            case ("Никакой"):
                break;
        }
        System.out.println("Введите параметр, который хотите вывести (X, Y, Оба):");
        ans = sc1.nextLine();
        switch (ans) {
            case ("X"):
                System.out.println(b.getX());
                break;
            case ("Y"):
                System.out.println(b.getY());
                break;
            case ("Оба"):
                System.out.println(b.toString());
                break;
        }
    }
}
