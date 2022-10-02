package ru.mirea.task3.Book;
import ru.mirea.task3.Book.Book;
import ru.mirea.task3.Circle.Circle;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        String a, n, l, g;
        int d;
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Boolean logic = true;
        System.out.println("Автор: " + b.GetAuth());
        System.out.println("Название: " + b.GetName());
        System.out.println("Язык оригинала: " + b.GetLan());
        System.out.println("Жанр: " + b.GetGen());
        System.out.println("Год выхода: " + b.GetYear());
        while (logic) {
            System.out.println("Введите параметр, который хотите изменить (Нет для отмены):");
            String izm = sc.nextLine();
            switch (izm) {
                case ("Автор"):
                    System.out.println("Введите значение параметра:");
                    a = sc.nextLine();
                    b.SetAuth(a);
                    break;
                case ("Название"):
                    System.out.println("Введите значение параметра:");
                    n = sc.nextLine();
                    b.SetName(n);
                    break;
                case ("Язык оригинала"):
                    System.out.println("Введите значение параметра:");
                    l = sc.nextLine();
                    b.SetLan(l);
                    break;
                case ("Жанр"):
                    System.out.println("Введите значение параметра:");
                    g = sc.nextLine();
                    b.SetGen(g);
                    break;
                case ("Год выхода"):
                    System.out.println("Введите значение параметра:");
                    d = sc1.nextInt();
                    b.SetYear(d);
                    break;
                case ("Нет"):
                    logic = false;
                    break;
            }
        }
        System.out.println("Введите параметр, который хотите вывести:");
        String omega = sc.nextLine();
        switch (omega) {
            case ("Автор"):
                System.out.println("Автор: " + b.GetAuth());
                break;
            case ("Название"):
                System.out.println("Название: " + b.GetName());
                break;
            case ("Язык оригинала"):
                System.out.println("Язык оригинала: " + b.GetLan());
                break;
            case ("Жанр"):
                System.out.println("Жанр: " + b.GetGen());
                break;
            case ("Год выхода"):
                System.out.println("Год выхода: " + b.GetYear());
                break;
            case ("Все"):
                System.out.println("Автор: " + b.GetAuth());
                System.out.println("Название: " + b.GetName());
                System.out.println("Язык оригинала: " + b.GetLan());
                System.out.println("Жанр: " + b.GetGen());
                System.out.println("Год выхода: " + b.GetYear());
                break;
        }
    }
}
