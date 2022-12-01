package ru.mirea.task26;

public class BankAcc {
    private int money;

    public BankAcc() {
        this.money = 0;
    }

    public boolean writeOffTheMoney(int sum) {
        if (money - sum < 0) {
            return false;
        } else {
            money -= sum;
            return true;
        }
    }

    public void depositTheMoney(int sum) {
        money += sum;
    }
}
