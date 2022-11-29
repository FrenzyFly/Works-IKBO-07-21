package ru.mirea.task14.packs;
import ru.mirea.task14.Card;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDeck implements Deck {
    private final Queue<Card> queue = new ArrayDeque<>();

    @Override
    public Card pop() {
        return queue.poll();
    }

    @Override
    public void push(Card card) {
        queue.add(card);
    }

    @Override
    public int size() {
        return queue.size();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
