package ru.mirea.task20;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    private static final String stringForm = "yyyy.MM.dd hh:MM";

    private static void firstTask() {
        Scanner in = new Scanner(System.in);
        String inData = in.nextLine();
        DateFormat format = new SimpleDateFormat(stringForm);
        Date d = null;
        try {
            d = format.parse(inData);
            Calendar cal = new GregorianCalendar(d.getYear(), d.getMonth(), d.getDay());
            System.out.println("Date: " + d);
            System.out.println("Calendar: " + cal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void secondTask() {
        String date = "2022.11.19 14:59";
        Date curd = new Date();
        Date dateOfA = null;
        DateFormat form = new SimpleDateFormat(stringForm);
        try {
            dateOfA = form.parse(date);
            System.out.println("My full name: Shakhtarin Daniil Vladimirovich");
            System.out.println("Date of assignment: " + dateOfA);
            System.out.println("Assignment due date: " + curd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
