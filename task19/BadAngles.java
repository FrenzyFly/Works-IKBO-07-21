package ru.mirea.task19;

public class BadAngles extends Exception {
    private String message;

    public BadAngles() {
        super();
        this.message = "";
    }

    public BadAngles(String m) {
        super();
        this.message = m;
    }

    @Override
    public String toString() {
        return "BadAngles " + message;
    }
}
