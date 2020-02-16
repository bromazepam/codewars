package com.company.java.kyu6;

public class PersistentBugger {
    public static int persistence(long n) {
        int a;int b = 1;int x = 0;
        while (n > 9) {
            while (n > 0) {
                a =(int) n%10;
                n = n/10;
                b = b*a;
            }
            n = b;
            b = 1;
            x++;
        }
        return x;
    }
}
