package ru.mirea.task13;
import java.util.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("world!");
        list.addFirst("Hello");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
