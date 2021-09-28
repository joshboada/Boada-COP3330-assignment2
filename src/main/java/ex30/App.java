package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 Josh Boada
 */

public class App {
    public static void main(String[] args) {
        PrintMultiTable();
    }
    private static void PrintMultiTable() {
        int row;
        int column;
        for (row=1; row<=12; row++) {
            for (column = 1; column <= 12; column++) {
                System.out.printf("%4d", (row*column));
            }
            System.out.print("\n");
        }
    }
}
