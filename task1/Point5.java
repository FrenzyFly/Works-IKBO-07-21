package ru.mirea.task1;
import java.util.Scanner;

public class Point5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер гармонического ряда: ");
        float num = sc.nextInt(), k = 1;
        while (k != num) {
            float ch = 1/k;
            System.out.print(ch);
            System.out.print(' ');
            k++;
        }
    }
}
