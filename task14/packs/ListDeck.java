package ru.mirea.task14.packs;
import ru.mirea.task14.Card;
import java.util.LinkedList;

public class ListDeck implements Deck {
    private final LinkedList<Card> list = new LinkedList<>();

    @Override
    public Card pop() {
        return list.pollLast();
    }

    @Override
    public void push(Card card) {
        list.push(card);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }
}
