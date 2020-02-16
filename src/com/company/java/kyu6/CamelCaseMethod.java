package com.company.java.kyu6;

public class CamelCaseMethod {
    public static String camelCase(String str) {
        if(str =="")
            return "";
        str = str.trim();
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            if(words[i].length()>1)
                sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
            if(words[i].length()==1)
                sb.append(words[i].substring(0, 1).toUpperCase());
        }
        return sb.toString();
    }
}
