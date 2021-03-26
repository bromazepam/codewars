package com.company.java.kyu5;

/**
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
 * N! = 1 * 2 * 3 * ... * N
 * Be careful 1000! has 2568 digits...
 *
 * Examples
 * zeros(6) = 1
 * # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero
 */

public class NumberOfTrailingZerosOfN {
    public static int zeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5)
            count += n / i;
        return count;
    }
}
