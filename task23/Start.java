package ru.mirea.task23;

public class Start {
    public static void main(String[] args) {
        Object[] obj = new Object[]{1, 2, "wasd", ' ', '\t', "qwerty"};
        PrintHashCodes(obj);
        CompareHashCodes(obj);
    }

    private static void CompareHashCodes(Object[] o) {
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (i == j) {
                    continue;
                }
                if (o[i].hashCode() == o[j].hashCode()) {
                    System.out.println("Hash code of (" + o[i].toString() + ") and hash code of (" + o[j].toString() + ") are equals");
                } else {
                    System.out.println("Hash code of (" + o[i].toString() + ") and hash code of (" + o[j].toString() + ") are not equals");
                }
            }
        }
    }

    private static void PrintHashCodes(Object[] o) {
        for (var item : o) {
            System.out.println("Hash code of (" + item.toString() + ") = " + item.hashCode());
        }
    }
}
