package com.company.java.kyu6;

public class PianoKataPart1 {
    public static String blackOrWhiteKey(int keyPressCount) {
        int[] white = {0, 2, 3, 5, 7, 8, 10};
        int key = (keyPressCount-1) % 88 %12;
        System.out.println(key);
        for(int s: white){
            if(s==key)
                return "white";
        }
        return "black";
    }
}
