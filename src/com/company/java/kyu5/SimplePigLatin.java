package com.company.java.kyu5;

public class SimplePigLatin {
    public static String pigIt(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            if(words[i].matches("[!?]*"))
                sb.append(words[i]);
            else
                sb.append(words[i].substring(1)).append(words[i].substring(0, 1)).append("ay ");
        }
        return sb.toString().trim();
    }
}
