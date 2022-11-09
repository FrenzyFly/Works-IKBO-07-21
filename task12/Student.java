package ru.mirea.task12;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private int[] idNum;
    private int sc;

    public Student() {
        idNum = new int[0];
        sc = 0;
    }

    public void setScore(int v) {
        sc = v;
    }

    public int getScore() {
        return sc;
    }

    public void fill() {
        for (int i =0; i < idNum.length; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
            idNum[i] = randomNum;
        }
    }

    public void sort(int s) {
        idNum = new int[s];
        fill();
        System.out.println("До сортировки вставками: ");
        System.out.println(Arrays.toString(idNum));
        insertionSort();
        System.out.println("После сортировки вставками: ");
        System.out.println(Arrays.toString(idNum));
    }

    public void insertionSort() {
        for (int left = 0; left < idNum.length; left++) {
            int value = idNum[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < idNum[i]) {
                    idNum[i + 1] = idNum[i];
                } else {
                    break;
                }
            }
            idNum[i + 1] = value;
        }
    }
}
