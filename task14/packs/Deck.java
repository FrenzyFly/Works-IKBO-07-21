package ru.mirea.task14.packs;
import ru.mirea.task14.Card;

public interface Deck {
    Card pop();

    void push(Card card);

    int size();

    boolean empty();
}
