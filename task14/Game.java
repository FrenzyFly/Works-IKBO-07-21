package ru.mirea.task14;
import ru.mirea.task14.packs.DequeueDeck;
import ru.mirea.task14.packs.ListDeck;
import ru.mirea.task14.packs.QueueDeck;
import ru.mirea.task14.packs.StackDeck;

public class Game {
    Player firstP;
    Player secondP;

    public Game(int num, Card[] fCards, Card[] sCards) {
        if (fCards == null || sCards == null || fCards.length != sCards.length) {
            throw new IllegalArgumentException();
        }
        switch (num) {
            case 1 -> {
                firstP = new Player(new StackDeck());
                secondP = new Player(new StackDeck());
            }
            case 3 -> {
                firstP = new Player(new DequeueDeck());
                secondP = new Player(new DequeueDeck());
            }
            case 4 -> {
                firstP = new Player(new ListDeck());
                secondP = new Player(new ListDeck());
            }
            default -> {
                firstP = new Player(new QueueDeck());
                secondP = new Player(new QueueDeck());
            }
        }
        for (var item : fCards) {
            firstP.push(item);
        }
        for (var item : sCards) {
            secondP.push(item);
        }
    }

    boolean tick() {
        if (firstP.empty() || secondP.empty()) {
            return false;
        }
        Card first = firstP.pop();
        Card second = secondP.pop();

        if (first.getForce() == 0) {
            if (second.getForce() == 9) {
                firstP.push(first);
                firstP.push(second);
                return true;
            }
        }

        if (second.getForce() == 0) {
            if (first.getForce() == 9) {
                secondP.push(first);
                secondP.push(second);
                return true;
            }
        }

        if (first.getForce() < second.getForce()) {
            secondP.push(first);
            secondP.push(second);
        } else {
            firstP.push(first);
            firstP.push(second);
        }

        return true;
    }

    String whoWin() {
        if ((firstP.empty() && secondP.empty()) ||
                (!firstP.empty() && !secondP.empty())) {
            return "botva";
        } else if (firstP.empty()) {
            return "second";
        } else {
            return "first";
        }
    }
}
