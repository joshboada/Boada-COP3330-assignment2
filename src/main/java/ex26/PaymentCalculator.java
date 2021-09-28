package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Josh Boada
 */

import static java.lang.Math.log;

public class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(double balance, double APR, double monthly) {
        double dailyRate = (APR / 100) / 365;
        double result = 1 - Math.pow((1 + (dailyRate)), 30);
        result = log(1 + ((balance/monthly) * result));
        result /= Math.log(1 + (dailyRate));
        result *= -(1.0/30.0);

        return (int) Math.ceil(result);
    }
}
