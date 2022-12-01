package ru.mirea.task29;
import java.io.Serializable;
import java.util.ArrayList;

public class CurrencyInfo implements Serializable {
    private String str = "SomeString";
    private int sint = 43;

    public CurrencyInfo() {
    }

    public CurrencyInfo(String ss, int si) {
        this.str = ss;
        this.sint = si;
    }
}
