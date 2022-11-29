package ru.mirea.task18;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class OnlineStore {
    private final HashMap<String, Customer> users;

    public OnlineStore() {
        this.users = new HashMap<>();
    }

    public void add(Customer cust) {
        if (users.containsKey(cust.getInn())) {
            throw new IllegalArgumentException("User with this inn number already contains!");
        }
        users.put(cust.getInn(), cust);
    }

    public void remove(String inn) {
        if (inn.length() != 10) {
            throw new IllegalArgumentException("Non correct inn number");
        }
        if (!users.containsKey(inn)) {
            throw new IllegalArgumentException("User with this inn is not contains!");
        }
        users.remove(inn);
    }

    public Customer get(String inn) {
        if (inn.length() != 10) {
            throw new IllegalArgumentException("Non correct inn number");
        }
        if (!users.containsKey(inn)) {
            throw new IllegalArgumentException("User with this inn is not contains!");
        }
        return users.get(inn);
    }

    Collection<Customer> values() {
        return users.values();
    }
}
