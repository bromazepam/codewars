package com.company.java.kyu6;

public class DuplicateEncoder {
    static String encode(String word){
        String str="";
        word = word.toLowerCase();
        System.out.println(word);
        for (int i = 0; i < word.length();  i++){
            char c = word.charAt(i);
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                str+="(";
            } else {
                str+=")";
            }
        }
        return str;
    }
}
