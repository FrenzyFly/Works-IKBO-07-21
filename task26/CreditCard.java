package ru.mirea.task26;

public class CreditCard implements PaymentMethod {
    @Override
    public boolean Pay(PurchaseInf info) {
        boolean result = info.getBankAccount().writeOffTheMoney(info.getAllPrice());
        return result;
    }
}
