package ru.mirea.task5.Dish;
import ru.mirea.task5.Dish.Dish;
import java.util.Scanner;

public class TestDish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String f = " ", c = " ";
        int s = 0;
        Plate p = new Plate(f, c, s);
        Cup cp = new Cup(f, c, s);
        Fork fr = new Fork(f, c, s);
        Knife k = new Knife(f, c, s);
        Spoon sp = new Spoon(f, c, s);
        Glass g = new Glass(f, c, s);
        Boolean log = true;
        String ans;
        while (log) {
            System.out.println("What dish do you want to add ('No' for cancel):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Plate"):
                    System.out.println("Enter parameters (form, colour and size):");
                    f = sc.nextLine();
                    c = sc.nextLine();
                    s = sc1.nextInt();
                    p = new Plate(f, c, s);
                    break;
                case ("Cup"):
                    System.out.println("Enter parameters (form, colour and size):");
                    f = sc.nextLine();
                    c = sc.nextLine();
                    s = sc1.nextInt();
                    cp = new Cup(f, c, s);
                    break;
                case ("Fork"):
                    System.out.println("Enter parameters (form, colour and size):");
                    f = sc.nextLine();
                    c = sc.nextLine();
                    s = sc1.nextInt();
                    fr = new Fork(f, c, s);
                    break;
                case ("Knife"):
                    System.out.println("Enter parameters (form, colour and size):");
                    f = sc.nextLine();
                    c = sc.nextLine();
                    s = sc1.nextInt();
                    k = new Knife(f, c, s);
                    break;
                case ("Spoon"):
                    System.out.println("Enter parameters (form, colour and size):");
                    f = sc.nextLine();
                    c = sc.nextLine();
                    s = sc1.nextInt();
                    sp = new Spoon(f, c, s);
                    break;
                case ("Glass"):
                    System.out.println("Enter parameters (form, colour and size):");
                    f = sc.nextLine();
                    c = sc.nextLine();
                    s = sc1.nextInt();
                    g = new Glass(f, c, s);
                    break;
                case ("No"):
                    log = false;
                    break;
            }
        }
        log = true;
        while (log) {
            System.out.println("What dish parameters you want to know? ('No' for cancel):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Plate"):
                    System.out.println(p.GetConf());
                    break;
                case ("Cup"):
                    System.out.println(cp.GetConf());
                    break;
                case ("Fork"):
                    System.out.println(fr.GetConf());
                    break;
                case ("Knife"):
                    System.out.println(k.GetConf());
                    break;
                case ("Spoon"):
                    System.out.println(sp.GetConf());
                    break;
                case ("Glass"):
                    System.out.println(g.GetConf());
                    break;
                case ("No"):
                    log = false;
                    break;
            }
        }
    }
}
