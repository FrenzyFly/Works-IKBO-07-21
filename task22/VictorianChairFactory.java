package ru.mirea.task22;

public class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
