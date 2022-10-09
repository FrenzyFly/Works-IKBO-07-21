package ru.mirea.task5.Furniture;

public abstract class Furniture {
    private String model;
    private String colour;
    private int price;

    public Furniture(String m, String c, int p) {
        this.model = m;
        this.colour = c;
        this.price = p;
    }
    public String GetConf() {
        return ("Model: " + this.model + ", Colour: " + this.colour + ", Price: " + this.price);
    }
    public int GetPrice() {
        return (this.price);
    }
}
