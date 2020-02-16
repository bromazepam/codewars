package com.company.java.kyu7;

public class FindTheNextPerfectSquare {
    public static long findNextSquare(long sq) {
        long res = 0;
        if(Math.sqrt(sq)-Math.floor(Math.sqrt(sq)) == 0)
            res =(long) Math.sqrt(sq)+1;
        else return -1;
        return res*res;
    }
}
