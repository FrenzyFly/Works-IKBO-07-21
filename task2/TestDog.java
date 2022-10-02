package ru.mirea.task2;
import ru.mirea.task2.Dog;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Dog dig = new Dog();
        String str;
        System.out.println("Введите количество ваших собак:");
        int kol = sc.nextInt();
        String[] a = new String [kol];
        int[] b = new int [kol];
        for (int i = 0; i < kol; i++) {
            System.out.println("Введите имя и возраст собаки:");
            a[i] = sc1.nextLine();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < kol; i++) {
            dig.name(a[i]);
            dig.age(b[i]);
            str = dig.ToString();
            System.out.println(str);
        }
    }
}
