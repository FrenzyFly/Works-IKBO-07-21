package ru.mirea.task5.Furniture;
import ru.mirea.task5.Furniture.FurnitureShop;
import java.util.Scanner;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop tool = new FurnitureShop();
        tool.Addition();
        tool.Info();
        tool.Cart();
        tool.Balance();
        tool.Buy();
    }
}
