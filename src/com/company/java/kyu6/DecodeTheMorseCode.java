package com.company.java.kyu6;

/**
 * you can access the preloaded Morse code table through MorseCode.get(code) - codewars
 **/
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
