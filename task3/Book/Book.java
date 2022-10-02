package ru.mirea.task3.Book;

public class Book {
    String author = "Достоевский Ф.М.";
    String name = "Преступление и наказание";
    String language = "Русский";
    String genre = "Роман";
    int date = 1866;
    public void SetAuth(String a) {
        author = a;
    }
    public void SetName(String n) {
        name = n;
    }
    public void SetLan(String l) {
        language = l;
    }
    public void SetGen(String g) {
        genre = g;
    }
    public void SetYear(int d) {
        date = d;
    }
    public String GetAuth() {
        return author;
    }
    public String GetName() {
        return name;
    }
    public String GetLan() {
        return language;
    }
    public String GetGen() {
        return genre;
    }
    public int GetYear() {
        return date;
    }
}
