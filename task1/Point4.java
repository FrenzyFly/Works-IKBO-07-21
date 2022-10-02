package ru.mirea.task1;
import java.util.Scanner;

public class Point4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
