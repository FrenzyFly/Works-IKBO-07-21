package ru.mirea.task1;

public class Point3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int k = 10, s = 0;
        while (k > 0) {
            // a[k - 1] = (int)(Math.random() * 100);
            a[k - 1] = k;
            k--;
        }
        for (int i = 0; i < 10; i++) {
            s += a[i];
        }
        System.out.println(s);
    }
}
