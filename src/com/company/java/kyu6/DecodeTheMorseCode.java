package com.company.java.kyu6;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        String[] str = morseCode.split(" ");
        String decoded="";
        for(int i = 0; i< str.length;i++){
            if(MorseCode.get(str[i])!=null)
                decoded+=MorseCode.get(str[i]);
            if(MorseCode.get(str[i])==null && MorseCode.get(str[i+1])==null)
                decoded+=" ";
        }
        return decoded.trim();
    }
}
