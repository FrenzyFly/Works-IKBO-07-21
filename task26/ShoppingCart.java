package ru.mirea.task26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ShoppingCart implements Iterable {
    private ArrayList<Product> products;
    private PaymentMethod paymentMethod;

    public ShoppingCart() {
        products = new ArrayList<>();
        paymentMethod = null;
    }

    public boolean buy(BankAcc bacc) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("paymentMethod");
        }
        return paymentMethod.Pay(new PurchaseInf(products, bacc));
    }

    public void addToCart(Product pr) {
        products.add(pr);
    }

    public void removeFromCart(int ind) {
        products.remove(ind);
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod pam) {
        this.paymentMethod = pam;
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
