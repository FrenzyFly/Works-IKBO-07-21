package ru.mirea.task21;
import java.util.LinkedList;

public class MetroList {
    public LinkedList<Metro> list;

    public MetroList() {
        list = new LinkedList<>();
        list.add(new Metro(1, "red line"));
        list.add(new Metro(2, "orange line"));
        list.add(new Metro(3, "yellow line"));
        list.add(new Metro(4, "green line"));
        list.add(new Metro(5, "blue line"));
        list.add(new Metro(6, "dark blue line"));
        list.add(new Metro(7, "purple line"));
    }

    public void PrintList(boolean par) {
        int n = 0;
        for (var i : list) {
            if ((n % 2 == 0) == par) {
                System.out.println(i);
            }
            n++;
        }
    }

    public static void main(String[] args) {
        MetroList list = new MetroList();
        list.PrintList(true);
        list.PrintList(false);
    }
}
