package com.company.java.kyu6;

public class Stop_gninnipS_My_sdroW {
    public String spinWords(String sentence) {
        String[] str = sentence.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for(String string: str){
            if(string.length()>4){
                String rev = new StringBuilder(string).reverse().toString();
                reverseString.append(rev + " ");
            } else reverseString.append(string + " ");
        }
        return reverseString.toString().trim();
    }
}
