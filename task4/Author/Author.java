package ru.mirea.task4.Author;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String e) {
        email = e;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return ("Имя автора: " + name + ", эл.почта: " + email + ", пол: " + gender);
    }
}
