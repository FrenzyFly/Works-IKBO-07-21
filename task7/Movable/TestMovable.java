package ru.mirea.task7.Movable;
import ru.mirea.task7.Movable.Movable;
import java.util.Scanner;

public class TestMovable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int xi, yi, xs, ys;
        boolean log = true;
        System.out.println("What object do you want to move? (Point, Circle, Rectangular)");
        String ans = sc.nextLine();
        switch (ans) {
            case ("Point"):
                System.out.println("Enter coordinates and displacement speeds:");
                xi = sc1.nextInt();
                yi = sc1.nextInt();
                xs = sc1.nextInt();
                ys = sc1.nextInt();
                MovablePoint p = new MovablePoint(xi, yi, xs, ys);
                while (log) {
                    System.out.println("Which direction do you want to move the object ('No' for cancel):");
                    ans = sc.nextLine();
                    switch (ans) {
                        case ("Up"):
                            p.moveUp();
                            break;
                        case ("Down"):
                            p.moveDown();
                            break;
                        case ("Left"):
                            p.moveLeft();
                            break;
                        case ("Right"):
                            p.moveRight();
                            break;
                        case ("No"):
                            log = false;
                            break;
                    }
                }
                System.out.println(p.toString());
                break;
            case ("Circle"):
                System.out.println("Enter coordinates, displacement speeds and radius:");
                xi = sc1.nextInt();
                yi = sc1.nextInt();
                xs = sc1.nextInt();
                ys = sc1.nextInt();
                int r = sc1.nextInt();
                MovableCircle c = new MovableCircle(xi, yi, xs, ys, r);
                while (log) {
                    System.out.println("Which direction do you want to move the object ('No' for cancel):");
                    ans = sc.nextLine();
                    switch (ans) {
                        case ("Up"):
                            c.moveUp();
                            break;
                        case ("Down"):
                            c.moveDown();
                            break;
                        case ("Left"):
                            c.moveLeft();
                            break;
                        case ("Right"):
                            c.moveRight();
                            break;
                        case ("No"):
                            log = false;
                            break;
                    }
                }
                System.out.println(c.toString());
                break;
            case ("Rectangle"):
                System.out.println("Enter coordinates for two point and displacement speeds:");
                xi = sc1.nextInt();
                yi = sc1.nextInt();
                int x2 = sc1.nextInt();
                int y2 = sc1.nextInt();
                xs = sc1.nextInt();
                ys = xs;
                MovableRectangle rct = new MovableRectangle(xi, yi, x2, y2, xs, ys);
                while (log) {
                    System.out.println("Which direction do you want to move the object ('No' for cancel):");
                    ans = sc.nextLine();
                    switch (ans) {
                        case ("Up"):
                            rct.moveUp();
                            break;
                        case ("Down"):
                            rct.moveDown();
                            break;
                        case ("Left"):
                            rct.moveLeft();
                            break;
                        case ("Right"):
                            rct.moveRight();
                            break;
                        case ("No"):
                            log = false;
                            break;
                    }
                }
                System.out.println(rct.toString());
                break;
        }
    }
}
