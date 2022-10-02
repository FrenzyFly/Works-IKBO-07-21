package ru.mirea.task3.Circle;
import ru.mirea.task3.Circle.Circle;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double r, l, s;
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Радиус: " + c.GetRad());
        System.out.println("Длина: " + c.GetLen());
        System.out.println("Площадь: " + c.GetSq());
        System.out.println("Введите параметр, который хотите изменить (Радиус, Длина, Площадь):");
        String izm = sc.nextLine();
        switch (izm) {
            case ("Радиус"):
                System.out.println("Введите значение параметра:");
                r = sc1.nextDouble();
                c.SetRad(r);
                break;
            case ("Длина"):
                System.out.println("Введите значение параметра:");
                l = sc1.nextDouble();
                c.SetLen(l);
                break;
            case ("Площадь"):
                System.out.println("Введите значение параметра:");
                s = sc1.nextDouble();
                c.SetSq(s);
                break;
        }
        System.out.println("Введите параметр, который хотите вывести (Радиус, Длина, Площадь, Все):");
        String omega = sc.nextLine();
        switch (omega) {
            case ("Радиус"):
                System.out.println("Радиус: " + c.GetRad());
                break;
            case ("Длина"):
                System.out.println("Длина: " + c.GetLen());
                break;
            case ("Площадь"):
                System.out.println("Площадь: " + c.GetSq());
                break;
            case ("Все"):
                System.out.println("Радиус: " + c.GetRad());
                System.out.println("Длина: " + c.GetLen());
                System.out.println("Площадь: " + c.GetSq());
                break;
        }
    }
}
