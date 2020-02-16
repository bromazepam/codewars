package com.company.java.kyu7;

public class IsThisATriangle {
    public static boolean isTriangle(int a, int b, int c){
        return (((a+b)>c) && ((a+c)>b) && ((c+b)>a)) ? true : false;
    }
}
