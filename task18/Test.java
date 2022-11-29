package ru.mirea.task18;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of users: ");
        int numberOfUsers = in.nextInt();

        try {
            OnlineStore shop = createShop(numberOfUsers);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static OnlineStore createShop(int numberOfUsers) {
        Scanner in = new Scanner(System.in);
        OnlineStore shop = new OnlineStore();

        for (int i = 0; i < numberOfUsers; i++) {
            String inn = in.nextLine();
            String fullName = in.nextLine();
            Customer user = new Customer(inn, fullName);
            shop.add(user);
        }

        return shop;
    }
}
