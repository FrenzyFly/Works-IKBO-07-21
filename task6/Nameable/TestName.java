package ru.mirea.task6.Nameable;
import ru.mirea.task6.Nameable.Nameable;
import java.util.Scanner;

public class TestName {
    public static void main(String[] args) {
        Company c = new Company();
        Dog d = new Dog();
        Human h = new Human();
        Mountain m = new Mountain();
        Planet p = new Planet();
        Toy t = new Toy();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which name do you want to know?");
        String ans = sc.nextLine();
        switch (ans) {
            case ("Company"):
                System.out.println(c.getName());
                break;
            case ("Dog"):
                System.out.println(d.getName());
                break;
            case ("Human"):
                System.out.println(h.getName());
                break;
            case ("Mountain"):
                System.out.println(m.getName());
                break;
            case ("Planet"):
                System.out.println(p.getName());
                break;
            case ("Toy"):
                System.out.println(t.getName());
                break;
        }
    }
}
