package com.company.java.kyu7;

public class SimpleFunReverseLetter {
    public static String reverseLetter(final String str) {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            if(Character.isLetter(str.charAt(i)))
                rev+=str.charAt(i);
        }
        return rev;
    }
}
