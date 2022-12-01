package ru.mirea.task27.SecondTask;
import java.util.Objects;

public class City {
    private final String city;
    private final String country;

    public City(String c, String cn) {
        this.city = c;
        country = cn;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", Country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City c1 = (City) o;
        return Objects.equals(city, c1.city) && Objects.equals(country, c1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country);
    }
}
