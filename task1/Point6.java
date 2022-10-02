package ru.mirea.task1;
import java.util.Arrays;

public class Point6 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int k = 10;
        while (k > 0) {
            a[k - 1] = (int)(Math.random() * 100);
            k--;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
        Arrays.sort(a);
        for (int j = 0; j < 10; j++) {
            System.out.print(a[j]);
            System.out.print(' ');
        }
    }
}
