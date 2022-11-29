package ru.mirea.task14;

public class Card {
    private final int draw;

    public Card(int d) {
        this.draw = d;
    }

    int getForce() {
        return draw;
    }
}
