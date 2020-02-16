package com.company.java.kyu6;

public class PizzaPieces {
    public static int  maxPizza(int cut) {
        if(cut<0) return -1;
        return ((cut*cut + cut +2)/2);
    }
}
