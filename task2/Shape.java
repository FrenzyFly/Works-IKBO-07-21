package ru.mirea.task2;
import java.util.Scanner;

public class Shape {
    public static void main(String[] ads) {
        System.out.println("Введите название фигуры:");
        Scanner sc = new Scanner(System.in);
        String sh = sc.nextLine();
        String ans = toString(sh);
        System.out.println(ans);
    }
    public static String toString(String s) {
        String shp = "Название вашей фигуры - " + s;
        return shp;
    }
}
