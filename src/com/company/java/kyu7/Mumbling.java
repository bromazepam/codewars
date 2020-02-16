package com.company.java.kyu7;

public class Mumbling {
    public static String accum(String s) {
        String str = "";
        for(int i =0;i<s.length();i++){
            str+=s.substring(i,i+1).toUpperCase();
            for(int j =0;j<i;j++){
                str+=s.substring(i,i+1).toLowerCase();;
            }
            if(i<s.length()-1) str+="-";
        }
        return str;
    }
}
//not great not terrible
