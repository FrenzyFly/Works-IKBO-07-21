package ru.mirea.task4.Author;
import java.util.Scanner;
import ru.mirea.task4.Author.Author;

public class TestAuthor {
    public static void main(String[] args) {
        String n, e, ans;
        char g;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя, электронную почту и пол автора:");
        n = sc.nextLine();
        e = sc.nextLine();
        g = sc1.next().charAt(0);
        Author au = new Author(n, e, g);
        System.out.println("Введите новую электронную почту (Нет в случае отказа):");
        ans = sc.nextLine();
        if (ans != "Нет") {
            au.setEmail(ans);
        }
        System.out.println("Введите параметр, который хотите узнать (Имя, Эл.почта, Пол, Все):");
        ans = sc.nextLine();
        switch (ans) {
            case ("Имя"):
                n = au.getName();
                System.out.println(n);
                break;
            case ("Эл.почта"):
                e = au.getEmail();
                System.out.println(e);
                break;
            case ("Пол"):
                g = au.getGender();
                System.out.println(g);
                break;
            case ("Все"):
                ans = au.toString();
                System.out.println(ans);
                break;
        }
    }
}
