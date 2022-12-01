package ru.mirea.task26;

public class DigitalWallet implements PaymentMethod {
    @Override
    public boolean Pay(PurchaseInf inf) {
        boolean result = inf.getBankAccount().writeOffTheMoney(inf.getAllPrice());
        return result;
    }
}
