package ru.mirea.task15;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Filing {
    private final static String path = "texts/task15.txt";

    public static void Write() {
        try(FileWriter wry = new FileWriter(path, false)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите текст: ");
            String ans = br.readLine();
            wry.write(ans);
            wry.flush();
        }
        catch(IOException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void Read() {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            while (str != null) {
                sb.append(str);
                sb.append(System.lineSeparator());
                str = br.readLine();
            }
            String eve = sb.toString();
            System.out.println(eve);
        }
        catch(IOException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void Replace() {
        Write();
    }

    public static void Add() {
        try(FileWriter wry = new FileWriter(path, true)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите текст:");
            String input = br.readLine();
            wry.write(input);
            wry.flush();
        }
        catch(IOException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args){
        Write();
        Read();
        Replace();
        Read();
        Add();
        Read();
    }
}
