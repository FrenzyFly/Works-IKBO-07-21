package ru.mirea.task5.Furniture;
import ru.mirea.task5.Furniture.Furniture;
import java.util.Scanner;

public class FurnitureShop {
    String m = " ", c = " ", ans;
    int p = 0, bal = 0, k = 0;
    Bed b = new Bed(m, c, p);
    Chair ch = new Chair(m, c, p);
    Sofa s = new Sofa(m, c, p);
    Table t = new Table(m, c, p);
    Wardrobe w = new Wardrobe(m, c, p);
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Boolean log = true;

    public void Addition() {
        while (log) {
            System.out.println("Enter furniture type ('No' for cancel):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Bed"):
                    System.out.println("Enter model, colour and price:");
                    m = sc.nextLine();
                    c = sc.nextLine();
                    p = sc1.nextInt();
                    b = new Bed(m, c, p);
                    break;
                case ("Chair"):
                    System.out.println("Enter model, colour and price:");
                    m = sc.nextLine();
                    c = sc.nextLine();
                    p = sc1.nextInt();
                    ch = new Chair(m, c, p);
                    break;
                case ("Sofa"):
                    System.out.println("Enter model, colour and price:");
                    m = sc.nextLine();
                    c = sc.nextLine();
                    p = sc1.nextInt();
                    s = new Sofa(m, c, p);
                    break;
                case ("Table"):
                    System.out.println("Enter model, colour and price:");
                    m = sc.nextLine();
                    c = sc.nextLine();
                    p = sc1.nextInt();
                    t = new Table(m, c, p);
                    break;
                case ("Wardrobe"):
                    System.out.println("Enter model, colour and price:");
                    m = sc.nextLine();
                    c = sc.nextLine();
                    p = sc1.nextInt();
                    w = new Wardrobe(m, c, p);
                    break;
                case ("No"):
                    log = false;
                    break;
            }
        }
    }

    public void Balance() {
        System.out.println("Enter amount you want to add to your balance:");
        bal = sc1.nextInt();
    }

    public void Cart() {
        log = true;
        while (log) {
            System.out.println("Enter furniture, that you want to add to your cart ('No' for cancel, 'R' for removal):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Bed"):
                    k += b.GetPrice();
                    break;
                case ("Chair"):
                    k += ch.GetPrice();
                    break;
                case ("Sofa"):
                    k += s.GetPrice();
                    break;
                case ("Table"):
                    k += t.GetPrice();
                    break;
                case ("Wardrobe"):
                    k += w.GetPrice();
                    break;
                case ("R"):
                    CartR();
                case ("No"):
                    log = false;
                    break;
            }
        }
    }

    public void CartR() {
        log = true;
        while (log) {
            System.out.println("Enter furniture, that you want to remove from your cart ('No' for cancel):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Bed"):
                    k -= b.GetPrice();
                    break;
                case ("Chair"):
                    k -= ch.GetPrice();
                    break;
                case ("Sofa"):
                    k -= s.GetPrice();
                    break;
                case ("Table"):
                    k -= t.GetPrice();
                    break;
                case ("Wardrobe"):
                    k -= w.GetPrice();
                    break;
                case ("No"):
                    log = false;
                    break;
            }
        }
    }

    public void Info() {
        log = true;
        while (log) {
            System.out.println("Enter furniture that you want to know more about ('No' for cancel):");
            ans = sc.nextLine();
            switch (ans) {
                case ("Bed"):
                    System.out.println(b.GetConf());
                    break;
                case ("Chair"):
                    System.out.println(ch.GetConf());
                    break;
                case ("Sofa"):
                    System.out.println(s.GetConf());
                    break;
                case ("Table"):
                    System.out.println(t.GetConf());
                    break;
                case ("Wardrobe"):
                    System.out.println(w.GetConf());
                    break;
                case ("No"):
                    log = false;
                    break;
            }
        }
    }

    public void Buy() {
        bal -= k;
        if (bal >= 0) {
            System.out.println("Thank you for you purchase");
        }
        else {
            System.out.println("Not enough funds");
        }
    }
}
