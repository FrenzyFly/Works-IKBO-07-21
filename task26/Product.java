package ru.mirea.task26;

public final class Product {
    private final int price;
    private final String name;

    public Product(String n, int p) {
        this.name = n;
        this.price = p;
    }

    public Product(Product pr) {
        this.name = pr.name;
        this.price = pr.price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product clone() {
        return new Product(this);
    }
}
