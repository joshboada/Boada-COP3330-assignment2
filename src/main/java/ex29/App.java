package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static boolean valid = false;

    public static void main(String[] args) {
        int rateofreturn = ValidateInput();
        int years = 72 / rateofreturn;
        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    private static int ValidateInput() {
        int val = 0;
        while (!valid)
        {
            System.out.print("What is the rate of return? ");
            String in = input.next();
            try {
                val = Integer.parseInt(in);
                valid = true;
                if (val == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    valid = false;
                }
            }
            catch (NumberFormatException ex) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        valid = false;
        return val;
    }

    public static int TestInput(int rateOfReturn) {
        while (!valid) {
            try {
                valid = true;
                if (rateOfReturn == 0) {
                    System.out.println("0 is not a valid input.");
                    valid = false;
                    return -999;
                }
            }
            catch (NumberFormatException ex) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        valid = false;
        return 72 / rateOfReturn;
    }

}
