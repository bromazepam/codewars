package com.company.java.kyu7;

public class SmoothNumbers {
    public static String isSmooth(long n) {
        int c = 0;
        for(int i =2;i<=7;i++){
            if((n%i==0)&&(n>1)){
                n= n/i;
                c=i;
                i--;
            }
        }
        if(n!=1) c=0;
        switch(c){
            case 7:
                return "humble number";
            case 5:
                return "Hamming number";
            case 3:
                return "3-smooth";
            case 2:
                return "power of 2";
            default:
                return "non-smooth";
        }
    }
}
