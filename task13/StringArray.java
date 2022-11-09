package ru.mirea.task13;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class StringArray {
    protected int size;
    protected int elementNum;
    protected int lastIndex;
    protected String[] array;

    public StringArray(int s) {
        size = s;
        array = new String[size];
    }

    public void add(String e) {
        array[lastIndex] = e;
        lastIndex++;
        elementNum++;
    }

    public void add(int in, String e) {
        if (in > lastIndex) { lastIndex = in;};
        String[] narray = new String[size];
        int k = 0;
        for (int i = 0; i < size; i++){
            if (i != in) {
                narray[i] = array[k];
                k++;
            }
            else {
                narray[i] = e;
            }
        }
        array = narray;
        elementNum++;
    }

    public String get(int i) {
        return array[i];
    }

    public void set(int i, String e) {
        array[i] = e;
    }

    public void remove(int in) {
        String[] narray = new String[size];
        for (int i = 0; i < size; i++){
            if (i != in) { narray[i] = array[i]; }
        }
        array = narray;
        elementNum--;
    }

    public void remove(String e) {
        String[] narray = new String[size];
        for (int i = 0; i < size; i++){
            if (!Objects.equals(array[i], e)) {
                narray[i] = array[i];
            }
        }
        array = narray;
        elementNum--;
    }

    public boolean isEmpty() {
        return elementNum > 0;
    }

    public String toString() {
        String res = "[";
        for (String e: array) {
            if (e != null) {
                res = res + e + ", ";
            }
        }
        res = res.substring(0, res.length() - 2);
        res = res + "]";
        return res;
    }

    public static void main(String[] args) {
        StringArray list1 = new StringArray(10);
        list1.add("Apple");
        list1.add("Fruit");
        System.out.println(list1);
        list1.add(1, "Banana");
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.remove("Banana");
        System.out.println(list1);
        list1.set(0, "Avocado");
        System.out.println(list1);
        list1.add("Fruit");
        list1.add("Cucumber");
        list1.add("Banana");
        System.out.println(list1);
        System.out.println(list1.isEmpty());
        list1.remove(1);
        list1.add(0, "Hibiscus");
        System.out.println(list1);
    }
}
