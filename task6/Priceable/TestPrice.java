package ru.mirea.task6.Priceable;
import ru.mirea.task6.Priceable.Priceable;
import java.util.Scanner;

public class TestPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which price do you want to know?");
        String ans = sc.nextLine();
        switch (ans) {
            case ("Shirt"):
                Shirt sh = new Shirt();
                System.out.println(sh.getPrice());
                break;
            case ("Sofa"):
                Sofa s = new Sofa();
                System.out.println(s.getPrice());
                break;
            case ("Table"):
                Table t = new Table();
                System.out.println(t.getPrice());
                break;
            case ("Tablet"):
                Tablet tb = new Tablet();
                System.out.println(tb.getPrice());
                break;
            case ("Toy"):
                Toy ty = new Toy();
                System.out.println(ty.getPrice());
                break;
            case ("Videogame"):
                Videogame v = new Videogame();
                System.out.println(v.getPrice());
                break;
        }
    }
}
