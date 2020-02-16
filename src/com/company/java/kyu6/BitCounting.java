package com.company.java.kyu6;

public class BitCounting {
    public static int countBits(int n){
        String bin = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
