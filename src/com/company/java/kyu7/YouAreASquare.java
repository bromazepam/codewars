package com.company.java.kyu7;

public class YouAreASquare {
    public static boolean isSquare(int n) {
        int num =(int) Math.sqrt(n);
        if(num*num==n) return true;
        return false;
    }
}
