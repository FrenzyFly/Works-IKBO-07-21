package ru.mirea.task27.FirstTask;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> namesMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the second name:");
            String sname = in.nextLine();
            System.out.println("Enter the name:");
            String n = in.nextLine();
            namesMap.remove(n);
            namesMap.put(n, sname);
        }
        namesMap.forEach((String k, String v) -> {
            System.out.println(v + " " + k);
        });
    }
}
