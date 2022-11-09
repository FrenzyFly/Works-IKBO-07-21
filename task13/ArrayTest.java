package ru.mirea.task13;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(10);
        list1.add("Apple");
        list1.add("Fruit");
        System.out.println(list1);
        list1.add(1, "Banana");
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.remove("Banana");
        System.out.println(list1);
        System.out.println(list1.set(0, "Avocado"));
        list1.add("Fruit");
        list1.add("Cucumber");
        list1.add("Banana");
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
        System.out.println(list1.isEmpty());
        list1.remove(1);
        list1.add(0, "Hibiscus");
        System.out.println(list1);
    }
}
