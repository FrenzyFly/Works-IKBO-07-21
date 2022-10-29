package ru.mirea.task10;

public class App {
    public static int Sumn(int n){
        if (n != 0) {
            return n%10 + Sumn(n/10);
        }
        return 0;
    }
    public static boolean Numch(int n, int d){
        if (d > n/2 | d >= n){
            return true;
        }
        if (n % d == 0 & d != 1){
            return false;
        }
        return Numch(n, ++d);
    }
    public static void Asm(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            Asm(n / k, k);
        }
        else {
            Asm(n, ++k);
        }
    }
    public static void main(String[] args) {
        int n = 12345;
        String ans = String.format("Вывод суммы цифр числа %s будет равно %s", n, Sumn(n));
        System.out.println(ans);

        n = 23;
        ans = String.format("Является ли число %s простым: %s", n, Numch(n, 1));
        System.out.println(ans);

        n = 123;
        ans = String.format("Далее все простые множители числа %s:", n);
        System.out.println(ans);
        Asm(n, 2);
    }
}
