package ru.mirea.task26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class PurchaseInf implements Iterable {
    private BankAcc bankAccount;
    private final List<Product> products;

    public PurchaseInf(List<Product> pr, BankAcc bac) {
        if (pr == null || bac == null) {
            throw new IllegalArgumentException();
        }
        this.products = new ArrayList<>(pr);
        this.bankAccount = bac;
    }

    public BankAcc getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAcc bac) {
        this.bankAccount = bac;
    }

    public int getAllPrice() {
        int result = 0;
        for (var item : products) {
            result += item.getPrice();
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return products.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        products.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return products.spliterator();
    }
}
