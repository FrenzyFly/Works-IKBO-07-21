package ru.mirea.task14;
import ru.mirea.task14.packs.Deck;

public class Player {
    private final Deck deck;

    public Player(Deck d) {
        this.deck = d;
    }

    public Card pop() {
        return deck.pop();
    }

    public void push(Card card) {
        deck.push(card);
    }

    public boolean empty() {
        return deck.empty();
    }
}
