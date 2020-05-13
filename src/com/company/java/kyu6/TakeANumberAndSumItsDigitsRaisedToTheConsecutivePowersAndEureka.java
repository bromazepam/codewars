package com.company.java.kyu6;

import java.util.ArrayList;
import java.util.List;

public class TakeANumberAndSumItsDigitsRaisedToTheConsecutivePowersAndEureka {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> sumDig = new ArrayList<>();
        for (long i = a; i <= b; i++){
            if (isSumDig(i)){
                sumDig.add(i);
            }
        }
        return sumDig;
    }

    public static boolean isSumDig(long n){
        String str = Long.toString(n);
        long num = 0;
        for(int i = 0; i < str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i));
            num += Math.pow(digit, i + 1);
        }
        return num == n;
    }
}
