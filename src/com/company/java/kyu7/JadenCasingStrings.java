package com.company.java.kyu7;

public class JadenCasingStrings {
    public String toJadenCase(String str) {
        if(str =="" || str == null)
            return null;
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            if(words[i].length()>1)
                sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1)).append(" ");
            if(words[i].length()==1)
                sb.append(words[i].substring(0, 1).toUpperCase()).append(" ");
        }
        return sb.toString().trim();
    }
}
