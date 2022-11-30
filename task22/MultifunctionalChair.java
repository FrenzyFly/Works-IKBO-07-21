package ru.mirea.task22;

public class MultifunctionalChair implements Chair {
    @Override
    public void OnSit() {
        System.out.println("You've sat on the multifunctional chair.");
    }
}
