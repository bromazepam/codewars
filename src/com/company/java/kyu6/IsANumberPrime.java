package com.company.java.kyu6;

public class IsANumberPrime {
    public static boolean isPrime(int num) {
        if(num <= 1)return false;
        if(num == 2 || num == 3)return true;
        if(num % 6 != 5 && num % 6 != 1)return false;
        int i = 5;
        while(i <= (int)Math.sqrt(num)){
            if(num%(i) == 0 || num%(i+2) == 0)return false;
            i+=6;
        }
        return true;
    }
}
//prime number can expressed in the form of 6*x+1 or 6*x-1 except 2 and 3
//a bit faster than traditional method ;)

