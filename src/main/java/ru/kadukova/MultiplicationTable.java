package ru.kadukova;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 2; x < 10; x++) {
            for (int y = 2; y < 10; y++)
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            System.out.println();
        }
    }
}
