package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = ReturnInput("What is your balance? ");
        double APR = ReturnInput("What is the APR on the card (as a percent)? ");
        double monthly = ReturnInput("What is the monthly payment you can make? ");

        PaymentCalculator PC = new PaymentCalculator();
        int numMonths = PC.calculateMonthsUntilPaidOff(balance, APR, monthly);
        PrintNumMonths(numMonths);
    }

    private static float ReturnInput(String prompt) {
        System.out.print(prompt);
        return input.nextFloat();
    }

    private static void PrintNumMonths(int Months) {
        System.out.printf("It will take you %d months to pay off this card.\n", Months);
    }
}