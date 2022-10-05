package ru.mirea.task5.Dog;

public class Dog {
    private String name;
    private String gender;
    private int age;

    public Dog(String n, String g, int a) {
        this.name = n;
        this.gender = g;
        this.age = a;
    }
    public String GetConf() {
        return ("Name: " + this.name + ", Gender: " + this.gender + ", Age: " + this.age);
    }
}
