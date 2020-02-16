package com.company.java.kyu7;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        int countx = 0, counto = 0;
        str=str.toLowerCase();
        for(int i =0; i< str.length();i++){
            if(str.charAt(i)=='x') countx ++;
            if(str.charAt(i)=='o') counto ++;
        }
        return (countx==counto);
    }
}
