package ru.mirea.task26;

public class Customer {
    private final ShoppingCart shoppingCart;
    private final BankAcc bankAccount;

    public Customer(ShoppingCart shart, BankAcc bac) {
        if (shart == null || bac == null) {
            throw new IllegalArgumentException();
        }
        this.bankAccount = bac;
        this.shoppingCart = shart;
    }

    public void addToCart(Product pr) {
        shoppingCart.addToCart(pr);
    }

    public void removeFromCart(int in) {
        shoppingCart.removeFromCart(in);
    }

    boolean buy() {
        return shoppingCart.buy(bankAccount);
    }

    void depositTheMoney(int amt) {
        bankAccount.depositTheMoney(amt);
    }
}
