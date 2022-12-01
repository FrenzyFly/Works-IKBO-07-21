package ru.mirea.task27.SecondTask;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class World implements Iterable {
    private final HashMap<String, HashSet<City>> map = new HashMap<>();

    public World() {}

    public void addCity(City c) {
        if (!map.containsKey(c.getCountry())) {
            map.put(c.getCountry(), new HashSet<>());
        }
        var set = map.get(c.getCountry());
        set.add(c);
    }

    public Set<City> getCities(String cn) {
        return map.get(cn);
    }

    public boolean containsCity(City c) {
        if (!map.containsKey(c.getCountry())) {
            return false;
        }
        return map.get(c.getCountry()).contains(c);
    }

    @Override
    public Iterator iterator() {
        return map.entrySet().iterator();
    }

    @Override
    public void forEach(Consumer action) {
        map.entrySet().forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return map.entrySet().spliterator();
    }
}
