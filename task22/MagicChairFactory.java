package ru.mirea.task22;

public class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
