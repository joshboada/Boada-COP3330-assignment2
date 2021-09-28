package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float[] nums = new float[5];
        float total = 0;
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = EnterNum();
            total += nums[i];
        }

        System.out.printf("The total is %.1f.", total);
    }

    private static float EnterNum()
    {
        System.out.print("Enter a number: ");
        return input.nextFloat();
    }
}