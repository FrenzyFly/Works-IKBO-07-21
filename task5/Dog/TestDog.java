package ru.mirea.task5.Dog;
import ru.mirea.task5.Dish.*;
import ru.mirea.task5.Dog.Dog;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String n = " ", g = " ";
        int a = 0;
        Doberman d = new Doberman(n, g, a);
        Poodle p = new Poodle(n, g, a);
        Shepherd sh = new Shepherd(n, g, a);
        Spaniel s = new Spaniel(n, g, a);
        ToyTerrier tt = new ToyTerrier(n, g, a);
        YorkshireTerrier yt = new YorkshireTerrier(n, g, a);
        Boolean log = true;
        String ans;
        while (log) {
            System.out.println("Enter dog breed ('No' for cancel):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Doberman"):
                    System.out.println("Enter name, gender and age:");
                    n = sc.nextLine();
                    g = sc.nextLine();
                    a = sc1.nextInt();
                    d = new Doberman(n, g, a);
                    break;
                case ("Poodle"):
                    System.out.println("Enter name, gender and age:");
                    n = sc.nextLine();
                    g = sc.nextLine();
                    a = sc1.nextInt();
                    p = new Poodle(n, g, a);
                    break;
                case ("Shepherd"):
                    System.out.println("Enter name, gender and age:");
                    n = sc.nextLine();
                    g = sc.nextLine();
                    a = sc1.nextInt();
                    sh = new Shepherd(n, g, a);
                    break;
                case ("Spaniel"):
                    System.out.println("Enter name, gender and age:");
                    n = sc.nextLine();
                    g = sc.nextLine();
                    a = sc1.nextInt();
                    s = new Spaniel(n, g, a);
                    break;
                case ("Toy terrier"):
                    System.out.println("Enter name, gender and age:");
                    n = sc.nextLine();
                    g = sc.nextLine();
                    a = sc1.nextInt();
                    tt = new ToyTerrier(n, g, a);
                    break;
                case ("Yorkshire terrier"):
                    System.out.println("Enter name, gender and age:");
                    n = sc.nextLine();
                    g = sc.nextLine();
                    a = sc1.nextInt();
                    yt = new YorkshireTerrier(n, g, a);
                    break;
                case ("No"):
                    log = false;
                    break;
            }
        }
        log = true;
        while (log) {
            System.out.println("What dog information you want to know? ('No' for cancel):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Doberman"):
                    System.out.println(d.GetConf());
                    break;
                case ("Poodle"):
                    System.out.println(p.GetConf());
                    break;
                case ("Shepherd"):
                    System.out.println(sh.GetConf());
                    break;
                case ("Spaniel"):
                    System.out.println(s.GetConf());
                    break;
                case ("Toy terrier"):
                    System.out.println(tt.GetConf());
                    break;
                case ("Yorkshire terrier"):
                    System.out.println(yt.GetConf());
                    break;
                case ("No"):
                    log = false;
                    break;
            }
        }
    }
}
