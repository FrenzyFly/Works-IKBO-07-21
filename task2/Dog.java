package ru.mirea.task2;

public class Dog {
    String name;
    int age;
    public void name(String n) {
        name = n;
    }
    public void age(int a) {
        age = a;
    }
    public int DogToHuman() {
        int ageh = age * 7;
        return (ageh);
    }
    public String ToString() {
        return ("Собаке, по кличке " + name + ", " + age + " собачьих и " + DogToHuman() + " человечьих лет");
    }
}
