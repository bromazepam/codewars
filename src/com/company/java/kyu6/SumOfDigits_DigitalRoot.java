package com.company.java.kyu6;

public class SumOfDigits_DigitalRoot {
    public static int digital_root(int n) {
        int a; int b = 0;
        while (n > 9) {
            while (n > 0) {
                a = n%10;
                n = n/10;
                b = b+a;
            }
            n = b;
            b = 0;
        }
        return n;
    }
}
