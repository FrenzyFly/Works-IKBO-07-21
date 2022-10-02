package ru.mirea.task3.Human;
import java.util.Scanner;
import ru.mirea.task3.Human.Head;
import ru.mirea.task3.Human.Body;
import ru.mirea.task3.Human.Legs;
import ru.mirea.task3.Human.Hands;

public class Human {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Head h = new Head();
        Body b = new Body();
        Legs l = new Legs();
        Hands h1 = new Hands();
        System.out.println("Введите часть тела, о которой хотите узнать подробности (Голова, Тело, Ноги, Руки, Все):");
        String par = sc.nextLine();
        switch (par) {
            case ("Голова"):
                h.Output();
                break;
            case ("Тело"):
                b.Output();
                break;
            case ("Ноги"):
                l.Output();
                break;
            case ("Руки"):
                h1.Output();
                break;
            case ("Все"):
                h.Output();
                b.Output();
                l.Output();
                h1.Output();
                break;
        }
    }
}
