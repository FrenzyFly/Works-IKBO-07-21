package ru.mirea.task12;
import java.util.ArrayList;
import java.util.Comparator;

public class SortStud implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getScore() - ((Student) o2).getScore();
    }
}
