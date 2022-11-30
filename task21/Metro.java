package ru.mirea.task21;

public class Metro {
    private final int num;
    private final String name;

    public Metro(int nol, String name) {
        this.num = nol;
        this.name = name;
    }

    public int getNumberOfLine() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MetroLine{" +
                "numberOfLine=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
