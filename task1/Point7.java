package ru.mirea.task1;

import java.util.Scanner;

public class Point7 {
    public static void main(String[] args) {
        System.out.println("Введите число, факториал которого хотите вычислить:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factor(num);
    }
    public static void factor(int ch) {
        int s = 1;
        for (int i = 1; i <= ch; i++) {
            s *= i;
        }
        System.out.print(s);
    }
}

