package ru.mirea.task5.Dish;

public abstract class Dish {
    private String form;
    private String colour;
    private int size;

    public Dish(String f, String c, int s) {
        this.form = f;
        this.colour = c;
        this.size = s;
    }
    public String GetConf() {
        return ("Form: " + this.form + ", Colour: " + this.colour + ", Size: " + this.size);
    }
}
